package com.thedarkhorse.account.repository.cartitem;

import com.thedarkhorse.account.model.CartItem;

import java.util.List;

public interface CartItemRepository {
    CartItem save(CartItem cartItem);

    List<CartItem> getCartItemsByCartId(Long cartId);
}
