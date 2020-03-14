package net.hackbee.springcloudkafkastream;

import java.util.function.Function;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private final double TAX_RATE_PERCENTAGE = 1.23;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Function<KStream<String, Order>, KStream<String, Order>> order() {
        return input -> input
            .map((k, v) -> {
                v.setValue(v.getValue() * TAX_RATE_PERCENTAGE);
                return new KeyValue<>(k, v);
            });
    }


}
