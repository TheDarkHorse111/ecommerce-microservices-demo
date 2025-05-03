package com.thedarkhorse.order.entity;

import com.thedarkhorse.order.constant.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import static jakarta.persistence.EnumType.STRING;

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


    @Column(name = "status")
    @Enumerated(STRING)
    private OrderStatus status;
}