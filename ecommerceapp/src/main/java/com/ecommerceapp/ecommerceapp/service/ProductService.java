package com.ecommerceapp.ecommerceapp.service;

import com.ecommerceapp.ecommerceapp.model.Product;
import com.ecommerceapp.ecommerceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }

    public void deleteByTitle(String title) {
        productRepository.deleteByTitle(title);
    }
}
