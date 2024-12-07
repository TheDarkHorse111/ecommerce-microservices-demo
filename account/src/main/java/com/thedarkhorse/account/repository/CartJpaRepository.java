package com.thedarkhorse.account.repository;

import com.thedarkhorse.account.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartJpaRepository extends JpaRepository<CartEntity, Long> {
    Optional<CartEntity> findByAccountId(Long accountId);
}
