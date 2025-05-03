package com.thedarkhorse.account.service;

import com.thedarkhorse.account.model.CartItem;

import java.util.List;

public interface CartItemService {
    CartItem save(CartItem cartItem);

    List<CartItem> getCartItemsByCartId(Long cartId);
}
