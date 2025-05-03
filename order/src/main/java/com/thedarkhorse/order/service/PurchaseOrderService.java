package com.thedarkhorse.order.service;

import com.thedarkhorse.order.model.CartItem;
import com.thedarkhorse.order.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderService {
    PurchaseOrder createPurchaseOrder(List<CartItem> cartItems);

    List<PurchaseOrder> findByCartId(long cartId);
}
