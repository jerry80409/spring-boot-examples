package com.example.springbootexamples.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResp implements Serializable {

  private Integer id;

  private String lastName;

  private String firstName;

  private String company;

  private String state;

  private String country;
}
