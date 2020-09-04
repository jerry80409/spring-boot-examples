package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
