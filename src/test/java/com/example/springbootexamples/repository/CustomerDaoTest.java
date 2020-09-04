package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerDaoTest {

  @Autowired
  private CustomerDao customerDao;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  /**
   * 簡單的 JPA 取資料測試
   */
  @Test
  void getOne() {
    Customer customer = customerDao.findById(1)
        .orElseThrow(() -> new RuntimeException("Customer not found, id: " + 1));

    assertThat(customer.getFirstName(), is("Clarence"));
    assertThat(customer.getLastName(), is("Gray"));
  }
}