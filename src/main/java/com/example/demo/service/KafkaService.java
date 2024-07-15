package com.example.demo.service;

import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaService {
    KafkaTemplate<String, Object> kafkaTemplate;

    public void publisher(String message) {
        kafkaTemplate.send("message" , message);
    }

    @KafkaListener(topics = "message", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
