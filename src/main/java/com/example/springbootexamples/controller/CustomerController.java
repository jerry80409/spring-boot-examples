package com.example.springbootexamples.controller;

import com.example.springbootexamples.dto.CustomerResp;
import com.example.springbootexamples.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
public class CustomerController {

  private final CustomerService customerService;

  /**
   * Pageable 在 JPA 執行時, 會執行 2 次 Query,
   * 第 1 次為 select ... limit ?,
   * 第 2 次為 select count 取得總資料數
   *
   * @param pageable 預設 page: 0, size: 20, sort: UNSROTED
   * @return
   */
  @GetMapping
  ResponseEntity<Page<CustomerResp>> all(@PageableDefault(page = 0, size = 10) Pageable pageable) {
    return ResponseEntity.ok(customerService.all(pageable));
  }
  
}
