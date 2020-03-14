package net.hackbee.springcloudkafkastream;

import java.util.Properties;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.KafkaAdminClient;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
    
    private final String kafkaBootstrapServers;

    public KafkaConfiguration(@Value("${spring.kafka.bootstrap-servers}") String kafkaBootstrapServers) {
        this.kafkaBootstrapServers = kafkaBootstrapServers;
    }

    @Bean
    AdminClient kafkaAdminClient() {
        Properties properties = new Properties();
        properties.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaBootstrapServers);
        return KafkaAdminClient.create(properties);
    }

    @Bean
    public NewTopic ordersTopic() {
        return new NewTopic("orders", 1, (short) 1);
    }

    @Bean
    public NewTopic ordersTransformedTopic() {
        return new NewTopic("orders-transformed", 1, (short) 1);
    }

}
