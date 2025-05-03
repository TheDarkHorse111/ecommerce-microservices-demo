package com.thedarkhorse.order.service;

import com.thedarkhorse.order.model.CartItem;
import com.thedarkhorse.order.model.PurchaseOrder;
import com.thedarkhorse.order.repository.PurchaseOrderRepository;

import java.math.BigDecimal;
import java.util.List;

import static com.thedarkhorse.order.constant.OrderStatus.CREATED;
import static java.math.BigDecimal.ZERO;
import static java.util.Objects.isNull;

public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderServiceImpl(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public PurchaseOrder createPurchaseOrder(List<CartItem> cartItems) {
        if (isNull(cartItems) || cartItems.isEmpty())
            throw new IllegalArgumentException("Cart must have at least one item to order");
        PurchaseOrder order = new PurchaseOrder();
        order.setCartId(cartItems.get(0).getCartId());
        order.setStatus(CREATED);
        order.setTotal(cartItems.stream().map(this::getItemTotal).reduce(ZERO, BigDecimal::add));
        return repository.save(order);
    }

    @Override
    public List<PurchaseOrder> findByCartId(long cartId) {
        return repository.findByCartId(cartId);
    }

    private BigDecimal getItemTotal(CartItem cartItem) {
        return cartItem.getPricePerItem().multiply(BigDecimal.valueOf(cartItem.getQuantity()));
    }
}
