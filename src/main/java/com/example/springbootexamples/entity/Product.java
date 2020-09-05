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
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private String  productCode;

  @Column
  private String  productName;

  @Column
  private String  description;

  @Column
  private Long    standardCost;

  @Column
  private Long    listPrice;

  @Column
  private Integer targetLevel;

  @Column
  private Integer reorderLevel;

  @Column
  private Integer minimumReorderQuantity;

  @Column
  private String  quantityPerUnit;

  @Column
  private Integer discontinued;

}
