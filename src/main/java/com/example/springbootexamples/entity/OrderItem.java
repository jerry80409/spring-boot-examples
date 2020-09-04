package com.example.springbootexamples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "order_items")
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

  @EmbeddedId
  private CompositeOrderProductKey orderItemKey;

  @Column
  private BigDecimal quantity;

  @Column
  private BigDecimal unitPrice;

  @Column
  private BigDecimal discount;

  @Column
  private String orderItemStatus;

  @Column
  private LocalDate dateAllocated;
}
