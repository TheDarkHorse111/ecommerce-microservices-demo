package com.thedarkhorse.order.mapper;

import com.thedarkhorse.order.entity.PurchaseOrderEntity;
import com.thedarkhorse.order.model.PurchaseOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchaseOrderMapper {

    PurchaseOrderEntity toPurchaseOrderEntity(PurchaseOrder purchaseOrder);

    PurchaseOrder toPurchaseOrder(PurchaseOrderEntity purchaseOrderEntity);
}
