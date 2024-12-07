package com.thedarkhorse.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "purchase_order")
public class PurchaseOrderEntity extends BaseEntity {

    @NotNull
    @Column(name = "cart_id", nullable = false)
    private Long cartId;

    @NotNull
    @Column(name = "total", nullable = false, precision = 5, scale = 2)
    private BigDecimal total;

    @NotNull
    @Column(name = "payed_at", nullable = false)
    private Instant payedAt;

    @Size(max = 255)
    @Column(name = "status")
    private String status;
}