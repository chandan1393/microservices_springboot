package com.chandan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chandan.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
