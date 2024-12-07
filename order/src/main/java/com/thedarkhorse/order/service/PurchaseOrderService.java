package com.thedarkhorse.order.service;

import com.thedarkhorse.order.model.PurchaseOrder;

public interface PurchaseOrderService {
    PurchaseOrder save(PurchaseOrder purchaseOrder);

    PurchaseOrder findByCartId(long cartId);
}
