package com.example.springbootexamples.service;

import com.example.springbootexamples.dto.CustomerReq;
import com.example.springbootexamples.dto.CustomerResp;
import com.example.springbootexamples.entity.Customer;
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

  private static final CustomerMapper MAPPER = CustomerMapper.INSTANCE;

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
   * find all by page
   *
   * @param pageable
   * @return
   */
  public Page<CustomerResp> all(Pageable pageable) {
    return MAPPER.from(customerDao.findAll(pageable));
  }

  /**
   * insert
   *
   * @param customerReq
   * @return
   */
  public CustomerResp insert(CustomerReq customerReq) {
    Customer persisted = customerDao.save(MAPPER.from(customerReq));
    return MAPPER.from(persisted);
  }

  /**
   * update
   *
   * @param id
   * @param customerReq
   * @return
   */
  public CustomerResp update(Integer id, CustomerReq customerReq) {
    Customer persisted = customerDao.findById(id)
        .orElseThrow(() -> new RuntimeException("Customer not found, id: " + id));
    Customer preUpdate = MAPPER.copy(customerReq, persisted);
    Customer updated = customerDao.save(preUpdate);
    return MAPPER.from(updated);
  }

  /**
   * delete
   *
   * @param id
   */
  public void delete(Integer id) {
    Customer persisted = customerDao.findById(id)
        .orElseThrow(() -> new RuntimeException("Customer not found, id: " + id));
    customerDao.delete(persisted);
  }
}
