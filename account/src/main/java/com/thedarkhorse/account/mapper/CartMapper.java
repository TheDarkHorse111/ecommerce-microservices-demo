package com.thedarkhorse.account.mapper;

import com.thedarkhorse.account.entity.CartEntity;
import com.thedarkhorse.account.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {

    @Mapping(target = "account.id", source = "accountId")
    CartEntity toCartEntity(Cart cart);

    @Mapping(target = "accountId", source = "account.id")
    Cart toCart(CartEntity cartEntity);
}
