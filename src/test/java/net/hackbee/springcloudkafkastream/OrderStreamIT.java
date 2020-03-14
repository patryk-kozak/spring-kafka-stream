package net.hackbee.springcloudkafkastream;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.kafka.clients.consumer.Consumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class OrderStreamIT {

    @Autowired
    private KafkaTemplate<String, Order> orderKafkaTemplate;

    @Autowired
    private ConsumerFactory<String, Order> consumerFactory;


    @Test
    void shouldProcessOrder() {
        final String uuid = UUID.randomUUID().toString();
        Order order = Order.newBuilder()
            .setId(uuid)
            .setValue(500)
            .setItem("item")
            .build();

        Order expectedOrder = Order.newBuilder(order)
            .setValue(500 * 1.23)
            .build();

        orderKafkaTemplate.send("orders", order);

        List<Order> orders = fetchOrders();
        assertThat(orders.size()).isEqualTo(1);
        assertThat(orders.get(0)).isEqualTo(expectedOrder);
    }

    private List<Order> fetchOrders() {
        List<Order> orders = new ArrayList<>();
        try (Consumer<String, Order> orderConsumer = consumerFactory.createConsumer(
            "unique-group-id",
            this.getClass().getSimpleName())) {
            orderConsumer.subscribe(List.of("orders-transformed"));
            orderConsumer.poll(Duration.ofSeconds(2))
                .forEach(record -> orders.add(record.value()));
        }
        return orders;
    }

}
