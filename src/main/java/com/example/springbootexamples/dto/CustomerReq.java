package com.example.springbootexamples.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerReq implements Serializable {

  private String lastName;

  private String firstName;

  private String email;

  private String company;

  private String phone;

  private String address1;

  private String address2;

  private String city;

  private String state;

  private String postalCode;

  private String country;
}
