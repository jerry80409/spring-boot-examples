package com.example.springbootexamples.repository;

import com.example.springbootexamples.entity.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class EmployeeDaoTest {

  @Autowired
  private EmployeeDao employeeDao;

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
    Employee employee = employeeDao.findById(201)
        .orElseThrow(() -> new RuntimeException("Employee not found, id: " + 201));

    assertThat(employee.getFirstName(), is("George"));
    assertThat(employee.getLastName(), is("Harris"));
  }

}