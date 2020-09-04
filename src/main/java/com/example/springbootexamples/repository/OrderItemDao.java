package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.CompositeOrderProductKey;
import com.example.springbootexamples.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemDao extends JpaRepository<OrderItem, CompositeOrderProductKey> {
}
