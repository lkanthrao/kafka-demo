package com.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaHelloMessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaHelloMessageApplication.class, args);
    }

    @KafkaListener(topics = AppConstants.TOPIC, groupId = AppConstants.GROUP_ID)
    public void listen(String message) {

        System.out.println("Received Messasge : " + message);
    }
}