package com.thedarkhorse.account.config;

import com.thedarkhorse.account.mapper.AccountMapper;
import com.thedarkhorse.account.mapper.CartMapper;
import com.thedarkhorse.account.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public AccountRepository accountRepository(AccountJpaRepository repository, AccountMapper mapper) {
        return new AccountRepositoryImpl(repository, mapper);
    }

    @Bean
    public CartRepository cartRepository(CartJpaRepository repository, CartMapper mapper) {
        return new CartRepositoryImpl(repository, mapper);
    }
}
