package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.KafkaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@AllArgsConstructor
public class KafkaController {
    KafkaService kafkaService;

    @PostMapping("/publisher")
    public void publisher(@RequestBody String message) {
        kafkaService.publisher(message);
    }

    @PostMapping("/listen")
    public void listen(@RequestBody String message) {
        kafkaService.listen(message);
    }
}
