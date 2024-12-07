package com.thedarkhorse.account.repository;

import com.thedarkhorse.account.model.Cart;

public interface CartRepository {
    void save(Cart cart);

    Cart getCartByAccountId(Long accountId);
}
