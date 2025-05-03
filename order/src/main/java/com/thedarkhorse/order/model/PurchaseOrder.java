package com.thedarkhorse.order.model;

import com.thedarkhorse.order.constant.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PurchaseOrder {
    private Long id;
    private Long cartId;
    private BigDecimal total;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private OrderStatus status;
}
