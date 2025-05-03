package com.thedarkhorse.account.service;

import com.thedarkhorse.account.mapper.CartItemMapper;
import com.thedarkhorse.account.model.CartItem;
import com.thedarkhorse.account.repository.cartitem.CartItemJpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CartItemServiceImpl implements CartItemService {

    private final CartItemJpaRepository repository;
    private final CartItemMapper mapper;

    public CartItemServiceImpl(CartItemJpaRepository repository, CartItemMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return mapper.toCartItem(repository.save(mapper.toCartItemEntity(cartItem)));
    }

    @Override
    public List<CartItem> getCartItemsByCartId(Long cartId) {
        return repository.findByCartId(cartId)
                .stream()
                .map(mapper::toCartItem)
                .collect(Collectors.toList());
    }
}
