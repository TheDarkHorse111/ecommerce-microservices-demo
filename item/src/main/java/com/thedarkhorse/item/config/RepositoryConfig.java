package com.thedarkhorse.item.config;

import com.thedarkhorse.item.mapper.ItemMapper;
import com.thedarkhorse.item.repository.ItemJpaRepository;
import com.thedarkhorse.item.repository.ItemRepository;
import com.thedarkhorse.item.repository.ItemRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public ItemRepository itemRepository(ItemJpaRepository repository,
                                         ItemMapper mapper) {
        return new ItemRepositoryImpl(repository, mapper);
    }

}
