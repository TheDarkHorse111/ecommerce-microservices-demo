package com.thedarkhorse.item.repository;

import com.thedarkhorse.item.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemJpaRepository extends JpaRepository<ItemEntity, Long> {

    Optional<ItemEntity> findByItemName(String itemName);

}
