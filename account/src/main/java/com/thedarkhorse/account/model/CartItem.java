package com.thedarkhorse.account.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class CartItem {
    private Long id;
    private Long cartId;
    private Long itemId;
    private Integer quantity;
    private BigDecimal pricePerItem;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}