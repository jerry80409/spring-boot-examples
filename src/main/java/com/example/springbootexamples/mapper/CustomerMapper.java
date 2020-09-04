package com.example.springbootexamples.mapper;

import com.example.springbootexamples.dto.CustomerResp;
import com.example.springbootexamples.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper
public interface CustomerMapper {

  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  CustomerResp from(Customer customer);

  List<CustomerResp> from(List<Customer> customers);

  /**
   * 針對 Page interface 的處理, 可參閱
   * 此 issue 尚未 close 可能之後會有對應的 feature
   * https://github.com/mapstruct/mapstruct/issues/607
   *
   * @param customers
   * @return
   */
  default Page<CustomerResp> from(Page<Customer> customers) {
    return customers.map(this::from);
  }
}
