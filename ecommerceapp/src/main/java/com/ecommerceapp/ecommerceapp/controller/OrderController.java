package com.ecommerceapp.ecommerceapp.controller;

import com.ecommerceapp.ecommerceapp.model.Order;
import com.ecommerceapp.ecommerceapp.service.OrderService;
import com.ecommerceapp.ecommerceapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @PostMapping
    public ResponseEntity<Order> createProduct(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.save(order));
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteOrderById(@PathVariable String id) {
        orderService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/title/{title}")
    public ResponseEntity<Void> deleteOrderByTitle(@PathVariable String title) {
        orderService.deleteByTitle(title);
        return ResponseEntity.noContent().build();
    }
}

