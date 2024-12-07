package com.thedarkhorse.item.repository;

import com.thedarkhorse.item.mapper.ItemMapper;
import com.thedarkhorse.item.model.Item;

public class ItemRepositoryImpl implements ItemRepository {

    private final ItemJpaRepository itemJpaRepository;
    private final ItemMapper mapper;

    public ItemRepositoryImpl(ItemJpaRepository itemJpaRepository, ItemMapper mapper) {
        this.itemJpaRepository = itemJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Item save(Item item) {
        return mapper.toItem(itemJpaRepository.save(mapper.toItemEntity(item)));
    }

    @Override
    public Item findByName(String name) {
        return itemJpaRepository.findByItemName(name)
                .map(mapper::toItem)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }
}
