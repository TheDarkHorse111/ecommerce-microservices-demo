package com.thedarkhorse.item.mapper;

import com.thedarkhorse.item.entity.ItemEntity;
import com.thedarkhorse.item.model.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemEntity toItemEntity(Item item);

    Item toItem(ItemEntity itemEntity);
}
