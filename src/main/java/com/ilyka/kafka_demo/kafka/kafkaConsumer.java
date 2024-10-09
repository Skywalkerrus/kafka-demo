package com.ilyka.kafka_demo.kafka;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    @KafkaListener(topics="course", groupId = "my_consumer")
    public void listen(String message) {
        System.out.printf("getMess---> " + message);
    }
}
