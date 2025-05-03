package com.thedarkhorse.account.config;

import com.thedarkhorse.account.mapper.CartItemMapper;
import com.thedarkhorse.account.repository.account.AccountRepository;
import com.thedarkhorse.account.repository.cart.CartRepository;
import com.thedarkhorse.account.repository.cartitem.CartItemJpaRepository;
import com.thedarkhorse.account.service.AccountService;
import com.thedarkhorse.account.service.AccountServiceImpl;
import com.thedarkhorse.account.service.CartItemService;
import com.thedarkhorse.account.service.CartItemServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AccountService accountService(AccountRepository accountRepository, CartRepository cartRepository) {
        return new AccountServiceImpl(accountRepository, cartRepository);
    }

    @Bean
    public CartItemService cartItemService(CartItemJpaRepository repository, CartItemMapper cartItemMapper) {
        return new CartItemServiceImpl(repository, cartItemMapper);
    }
}
