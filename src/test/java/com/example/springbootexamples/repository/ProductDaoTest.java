package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class ProductDaoTest {

  @Autowired
  private ProductDao productDao;

  @BeforeEach
  void setUp() {
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void findOne() {
    Product product = productDao.findById(601)
        .orElseThrow(() -> new RuntimeException("Product not found, id: " + 601));

    assertThat(product.getProductCode(), is("P1"));
    assertThat(product.getProductName(), is("Nikon D810"));
  }
}