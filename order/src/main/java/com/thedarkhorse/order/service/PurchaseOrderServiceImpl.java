package com.thedarkhorse.order.service;

import com.thedarkhorse.order.model.PurchaseOrder;
import com.thedarkhorse.order.repository.PurchaseOrderRepository;

public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderServiceImpl(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public PurchaseOrder save(PurchaseOrder purchaseOrder) {
        return repository.save(purchaseOrder);
    }

    @Override
    public PurchaseOrder findByCartId(long cartId) {
        return null;
    }
}
