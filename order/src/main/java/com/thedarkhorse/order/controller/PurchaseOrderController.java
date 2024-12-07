package com.thedarkhorse.order.controller;

import com.thedarkhorse.order.model.PurchaseOrder;
import com.thedarkhorse.order.service.PurchaseOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/order")
public class PurchaseOrderController {

    private final PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PurchaseOrder> addOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return ResponseEntity.status(CREATED).body(service.save(purchaseOrder));
    }
}
