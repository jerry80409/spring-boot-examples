package com.example.springbootexamples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "members")
@NoArgsConstructor
@AllArgsConstructor
public class Member {

  @Id
  private String userId;

  @Column
  private String password = "";

  @Column
  private String company;

  @Column
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String email;

  @Column
  private Integer securityProviderId;

  @Column
  private Integer defaultCustomerId;

  @Column
  private String phone;

  @Column
  private String address1;

  @Column
  private String address2;

  @Column
  private String country;

  @Column
  private String postal;

  @Column
  @Enumerated(EnumType.STRING)
  private Role role;

  @Column
  private Boolean isActive;

  @Column
  private Boolean isBlocked;

  @Column
  private String secretQuestion;

  @Column
  private String secretAnswer;

  @Column
  private Boolean enableBetaTesting;

  @Column
  private Boolean enableRenewal;
}
