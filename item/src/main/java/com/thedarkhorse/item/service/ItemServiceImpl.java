package com.thedarkhorse.item.service;

import com.thedarkhorse.item.model.Item;
import com.thedarkhorse.item.repository.ItemRepository;

public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item findByName(String name) {
        return itemRepository.findByName(name);
    }
}
