package com.chandan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.entity.Inventory;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
