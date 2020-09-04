package com.example.springbootexamples.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 複合主鍵 Composite primary keys
 */
@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class CompositeOrderProductKey implements Serializable {

  private Integer orderId;
  private Integer productId;
}
