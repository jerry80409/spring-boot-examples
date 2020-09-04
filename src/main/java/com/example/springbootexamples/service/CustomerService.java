package com.example.springbootexamples.service;

import com.example.springbootexamples.dto.CustomerResp;
import com.example.springbootexamples.mapper.CustomerMapper;
import com.example.springbootexamples.repository.CustomerDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerDao customerDao;

  /**
   * find all
   *
   * @return
   */
  public List<CustomerResp> all() {
    return CustomerMapper.INSTANCE.from(customerDao.findAll());
  }

  /**
   * find all
   *
   * @param pageable
   * @return
   */
  public Page<CustomerResp> all(Pageable pageable) {
    return CustomerMapper.INSTANCE.from(customerDao.findAll(pageable));
  }
}
