package com.ecommerceapp.ecommerceapp.service;

import com.ecommerceapp.ecommerceapp.model.Order;
import com.ecommerceapp.ecommerceapp.repository.OrderRepository;
import com.ecommerceapp.ecommerceapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository OrderRepository;

    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    public Order save(Order product) {
        return OrderRepository.save(product);
    }

    public void deleteById(String id) {
        OrderRepository.deleteById(id);
    }

    public void deleteByTitle(String title) {
        OrderRepository.deleteByTitle(title);
    }
}
