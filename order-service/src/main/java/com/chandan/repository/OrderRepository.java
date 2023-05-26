package com.chandan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandan.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
