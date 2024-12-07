package com.thedarkhorse.order.repository;

import com.thedarkhorse.order.mapper.PurchaseOrderMapper;
import com.thedarkhorse.order.model.PurchaseOrder;

public class PurchaseOrderRepositoryImpl implements PurchaseOrderRepository {

    private final PurchaseOrderJpaRepository repository;
    private final PurchaseOrderMapper mapper;

    public PurchaseOrderRepositoryImpl(PurchaseOrderJpaRepository repository, PurchaseOrderMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PurchaseOrder save(PurchaseOrder purchaseOrder) {
        return mapper.toPurchaseOrder(repository.save(mapper.toPurchaseOrderEntity(purchaseOrder)));
    }

    @Override
    public PurchaseOrder findByCartId(long cartId) {
        return repository.findByCartId(cartId)
                .map(mapper::toPurchaseOrder)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}
