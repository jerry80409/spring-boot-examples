package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.CompositeOrderProductKey;
import com.example.springbootexamples.entity.OrderItem;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderItemDaoTest {

  @Autowired
  private OrderItemDao orderItemDao;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void test() {
    final int orderId = 4183;
    final int productId = 601;
    OrderItem orderItem = orderItemDao.findById(new CompositeOrderProductKey(orderId, productId))
        .orElseThrow(() ->
            new RuntimeException(String.format("Order Item not found, orderId: %s, productId: %s", orderId, productId)));

    assertThat(orderItem.getQuantity(), comparesEqualTo(BigDecimal.ONE));
    assertThat(orderItem.getUnitPrice(), comparesEqualTo(new BigDecimal("68.3400")));
  }
}