package com.jabros.Inventory_management_system.messaging;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class InventoryKafkaProducer {
    public static final String topicName = "inventory";

    @Autowired
    private KafkaTemplate<String, InventoryItem> kafkaTemplate;

    public void publishMessage(InventoryItem inventoryItem) {
        try {
            System.out.println("Publishing to Kafka");
            kafkaTemplate.send(topicName, inventoryItem);
            System.out.println("Published to Kafka!");
        } catch (KafkaException e) {
            System.out.println("Failed to Publish to Kafka, "+ e.getMessage());
        }
    }

}
