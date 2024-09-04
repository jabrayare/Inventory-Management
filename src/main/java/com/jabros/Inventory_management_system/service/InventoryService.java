package com.jabros.Inventory_management_system.service;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import com.jabros.Inventory_management_system.messaging.InventoryKafkaProducer;
import com.jabros.Inventory_management_system.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private InventoryKafkaProducer producer;
    public void addInventory(InventoryItem inventoryItem) {
        inventoryRepository.save(inventoryItem);
        producer.publishMessage(inventoryItem);
    }

    public List<InventoryItem> getListOfInventories(){
        return inventoryRepository.findAll();
    }
}
