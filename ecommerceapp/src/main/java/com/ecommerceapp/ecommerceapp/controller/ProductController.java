package com.ecommerceapp.ecommerceapp.controller;

import com.ecommerceapp.ecommerceapp.model.Product;
import com.ecommerceapp.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable String id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/title/{title}")
    public ResponseEntity<Void> deleteProductByTitle(@PathVariable String title) {
        productService.deleteByTitle(title);
        return ResponseEntity.noContent().build();
    }
}

