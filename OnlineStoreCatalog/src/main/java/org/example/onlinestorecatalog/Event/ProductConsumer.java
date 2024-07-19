package org.example.onlinestorecatalog.Event;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductConsumer {

    @KafkaListener(topics = "product_topic", groupId = "online-store-catalog-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}