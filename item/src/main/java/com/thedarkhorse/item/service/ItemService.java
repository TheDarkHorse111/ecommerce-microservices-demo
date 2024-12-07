package com.thedarkhorse.item.service;

import com.thedarkhorse.item.model.Item;

public interface ItemService {
    Item save(Item item);

    Item findByName(String name);
}
