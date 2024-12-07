package com.thedarkhorse.account.config;

import com.thedarkhorse.account.repository.AccountRepository;
import com.thedarkhorse.account.repository.CartRepository;
import com.thedarkhorse.account.service.AccountService;
import com.thedarkhorse.account.service.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AccountService accountService(AccountRepository accountRepository, CartRepository cartRepository) {
        return new AccountServiceImpl(accountRepository, cartRepository);
    }
}
