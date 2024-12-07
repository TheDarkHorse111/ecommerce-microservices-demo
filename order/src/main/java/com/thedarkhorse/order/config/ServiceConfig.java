package com.thedarkhorse.order.config;

import com.thedarkhorse.order.repository.PurchaseOrderRepository;
import com.thedarkhorse.order.service.PurchaseOrderService;
import com.thedarkhorse.order.service.PurchaseOrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public PurchaseOrderService purchaseOrderService(PurchaseOrderRepository repository) {
        return new PurchaseOrderServiceImpl(repository);
    }
}
