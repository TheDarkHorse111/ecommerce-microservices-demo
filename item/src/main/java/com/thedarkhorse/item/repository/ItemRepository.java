package com.thedarkhorse.item.repository;

import com.thedarkhorse.item.model.Item;

public interface ItemRepository {

    Item save(Item item);

    Item findByName(String name);
}
