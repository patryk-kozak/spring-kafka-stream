package net.hackbee.springcloudkafkastream;

import java.util.UUID;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple API endpoint to simulate traffic on living app
 * Launch at http://localhost:8080/api/send/{value} by default
 */
@RestController
@RequestMapping("/api")
public class Api {

    private final KafkaTemplate<String, Order> kafkatemplate;

    public Api(KafkaTemplate<String, Order> kafkatemplate) {
        this.kafkatemplate = kafkatemplate;
    }

    @GetMapping("/send/{value}")
    public void sendMsg(@PathVariable Double value) {
        kafkatemplate.send("orders", Order.newBuilder()
            .setId(UUID.randomUUID().toString())
            .setValue(value)
            .setItem("item")
            .build());
    }
}
