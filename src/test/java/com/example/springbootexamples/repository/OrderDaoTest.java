package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class OrderDaoTest {

  @Autowired
  private OrderDao orderDao;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void getOne() {
    Order order = orderDao.findById(4001)
        .orElseThrow(() -> new RuntimeException("Order not found, id: " + 4001));

    assertThat(order.getShipName(), is("Jean Fuller"));
    assertThat(order.getShipAddress1(), is("93 Spohn Place"));
  }
}