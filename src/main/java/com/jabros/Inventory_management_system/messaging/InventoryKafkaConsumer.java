package com.jabros.Inventory_management_system.messaging;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryKafkaConsumer {

    @KafkaListener(topics = "inventory", groupId = "ims_group_id")
    public void consumeMessage(InventoryItem inventoryItem){
        try {
            System.out.println("Consumed Message:: "+ inventoryItem.toString());
        } catch (KafkaException e) {
            System.out.println("Failed to consume message!");
        }
    }
}
