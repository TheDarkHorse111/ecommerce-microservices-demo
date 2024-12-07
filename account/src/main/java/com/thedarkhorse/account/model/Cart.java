package com.thedarkhorse.account.model;

import com.thedarkhorse.account.constant.CartStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cart {
    private Long id;
    private Long accountId;
    private Integer numberOfItems;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private CartStatus status;
}