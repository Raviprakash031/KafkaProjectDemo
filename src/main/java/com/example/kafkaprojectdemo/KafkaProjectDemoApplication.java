package com.example.kafkaprojectdemo;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProjectDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectDemoApplication.class, args);
    }

    @PreDestroy
    public void onExit() {
        // Add cleanup or shutdown logic here
    }

}
