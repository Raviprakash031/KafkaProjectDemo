package com.example.kafkaprojectdemo.controller;

import com.example.kafkaprojectdemo.service.KafkaProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/produce")
    public void produceMessage(@RequestBody String message) {
        try {
            producerService.sendMessage("my-topic", message);
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // Return a proper response to the client or rethrow the exception
        }
    }
}

