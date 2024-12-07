package com.thedarkhorse.order.repository;

import com.thedarkhorse.order.model.PurchaseOrder;

public interface PurchaseOrderRepository {

    PurchaseOrder save(PurchaseOrder purchaseOrder);

    PurchaseOrder findByCartId(long cartId);
}
