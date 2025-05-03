package com.thedarkhorse.account.config;

import com.thedarkhorse.account.mapper.AccountMapper;
import com.thedarkhorse.account.mapper.CartItemMapper;
import com.thedarkhorse.account.mapper.CartMapper;
import com.thedarkhorse.account.repository.account.AccountJpaRepository;
import com.thedarkhorse.account.repository.account.AccountRepository;
import com.thedarkhorse.account.repository.account.AccountRepositoryImpl;
import com.thedarkhorse.account.repository.cart.CartJpaRepository;
import com.thedarkhorse.account.repository.cart.CartRepository;
import com.thedarkhorse.account.repository.cart.CartRepositoryImpl;
import com.thedarkhorse.account.repository.cartitem.CartItemJpaRepository;
import com.thedarkhorse.account.repository.cartitem.CartItemRepository;
import com.thedarkhorse.account.repository.cartitem.CartItemRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public AccountRepository accountRepository(AccountJpaRepository repository, AccountMapper accountMapper) {
        return new AccountRepositoryImpl(repository, accountMapper);
    }

    @Bean
    public CartRepository cartRepository(CartJpaRepository repository, CartMapper cartMapper) {
        return new CartRepositoryImpl(repository, cartMapper);
    }

    @Bean
    public CartItemRepository cartItemRepository(CartItemJpaRepository repository, CartItemMapper cartItemMapper) {
        return new CartItemRepositoryImpl(repository, cartItemMapper);
    }
}
