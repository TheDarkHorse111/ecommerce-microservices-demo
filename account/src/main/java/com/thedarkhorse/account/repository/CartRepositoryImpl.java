package com.thedarkhorse.account.repository;

import com.thedarkhorse.account.mapper.CartMapper;
import com.thedarkhorse.account.model.Cart;

public class CartRepositoryImpl implements CartRepository {
    private final CartJpaRepository repository;
    private final CartMapper mapper;

    public CartRepositoryImpl(CartJpaRepository repository, CartMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void save(Cart cart) {
        repository.save(mapper.toCartEntity(cart));
    }

    @Override
    public Cart getCartByAccountId(Long accountId) {
        return repository.findByAccountId(accountId)
                .map(mapper::toCart)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
    }
}
