package com.jabros.Inventory_management_system.controller;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import com.jabros.Inventory_management_system.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/all")
    public List<InventoryItem> getInventories(){
        return inventoryService.getListOfInventories();
    }

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello world";
    }

    @GetMapping("/")
    public List<InventoryItem> fakeInventoryData(){
        return List.of(InventoryItem
                .builder()
                        .id(Long.parseLong("1"))
                        .name("Shoes")
                        .price(99.99)
                        .quantity(2)
                .build(),
                InventoryItem
                .builder()
                        .id(Long.parseLong("2"))
                        .name("Shorts")
                        .price(69.99)
                        .quantity(2)
                .build());
    }

    @PostMapping("/add")
    public void addInventory(@RequestBody InventoryItem item){
        inventoryService.addInventory(item);
    }
}
