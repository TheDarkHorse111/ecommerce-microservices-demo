package com.thedarkhorse.account.controller;

import com.thedarkhorse.account.model.CartItem;
import com.thedarkhorse.account.service.CartItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart-item")
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping
    public List<CartItem> getCartItems(@RequestParam Long cartId) {
        return cartItemService.getCartItemsByCartId(cartId);
    }
}
