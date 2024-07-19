package org.example.eventmanagementsystem.Event;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {

    @KafkaListener(topics = "event_topic", groupId = "event-management-system-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}

