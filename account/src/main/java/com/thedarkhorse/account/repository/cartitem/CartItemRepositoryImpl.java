package com.thedarkhorse.account.repository.cartitem;

import com.thedarkhorse.account.mapper.CartItemMapper;
import com.thedarkhorse.account.model.CartItem;

import java.util.List;
import java.util.stream.Collectors;

public class CartItemRepositoryImpl implements CartItemRepository {
    private final CartItemJpaRepository repository;
    private final CartItemMapper mapper;

    public CartItemRepositoryImpl(CartItemJpaRepository repository, CartItemMapper mapper) {
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
