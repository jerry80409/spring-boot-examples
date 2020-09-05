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
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private Integer employeeId;

  @Column
  private Integer customerId;

  @Column
  private LocalDate orderDate;

  @Column
  private LocalDate shippedDate;

  @Column
  private LocalDate paidDate;

  @Column
  private String shipName;

  @Column
  private String shipAddress1;

  @Column
  private String shipAddress2;

  @Column
  private String shipCity;

  @Column
  private String shipState;

  @Column
  private String shipPostalCode;

  @Column
  private String shipCountry;

  @Column
  private BigDecimal shippingFee;

  @Column
  private String paymentType;

  @Column
  private String orderStatus;
}
