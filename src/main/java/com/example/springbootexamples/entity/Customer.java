package com.example.springbootexamples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private String lastName;

  @Column
  private String firstName;

  @Column
  private String email;

  @Column
  private String company;

  @Column
  private String phone;

  @Column
  private String address1;

  @Column
  private String address2;

  @Column
  private String city;

  @Column
  private String state;

  @Column
  private String postalCode;

  @Column
  private String country;

}
