package com.jabros.Inventory_management_system.repository;

import com.jabros.Inventory_management_system.Modal.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}
