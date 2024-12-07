package com.thedarkhorse.account.mapper;

import com.thedarkhorse.account.entity.CartItemEntity;
import com.thedarkhorse.account.model.CartItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartItemEntity toCartItemEntity(CartItem cartItem);

    CartItem toCartItem(CartItemEntity cartItemEntity);
}
