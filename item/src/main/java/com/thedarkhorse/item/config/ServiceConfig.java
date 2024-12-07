package com.thedarkhorse.item.config;

import com.thedarkhorse.item.repository.ItemRepository;
import com.thedarkhorse.item.service.ItemService;
import com.thedarkhorse.item.service.ItemServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ItemService itemRepository(ItemRepository repository) {
        return new ItemServiceImpl(repository);
    }

}
