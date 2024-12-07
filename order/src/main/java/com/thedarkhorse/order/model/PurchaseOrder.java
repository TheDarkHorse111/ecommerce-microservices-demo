package com.thedarkhorse.order.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class PurchaseOrder {
    private Long id;
    private Long cartId;
    private BigDecimal total;
    private Instant payedAt;
    private Instant createdAt;
    private Instant updatedAt;
    private String status;
}
