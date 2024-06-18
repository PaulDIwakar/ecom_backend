package com.ecommerceapp.ecommerceapp.repository;

import com.ecommerceapp.ecommerceapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    void deleteById(String id);
    void deleteByTitle(String title);
}
