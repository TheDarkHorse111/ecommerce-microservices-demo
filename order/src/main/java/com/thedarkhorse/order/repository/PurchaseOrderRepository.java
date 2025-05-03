package com.thedarkhorse.order.repository;

import com.thedarkhorse.order.model.PurchaseOrder;

import java.util.List;

public interface PurchaseOrderRepository {

    PurchaseOrder save(PurchaseOrder purchaseOrder);

    List<PurchaseOrder> findByCartId(long cartId);
}
