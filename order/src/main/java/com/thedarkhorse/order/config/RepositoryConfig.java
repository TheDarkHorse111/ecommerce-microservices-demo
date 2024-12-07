package com.thedarkhorse.order.config;

import com.thedarkhorse.order.mapper.PurchaseOrderMapper;
import com.thedarkhorse.order.repository.PurchaseOrderJpaRepository;
import com.thedarkhorse.order.repository.PurchaseOrderRepository;
import com.thedarkhorse.order.repository.PurchaseOrderRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public PurchaseOrderRepository purchaseOrderRepository(PurchaseOrderJpaRepository repository,
                                                           PurchaseOrderMapper mapper) {
        return new PurchaseOrderRepositoryImpl(repository, mapper);
    }

}
