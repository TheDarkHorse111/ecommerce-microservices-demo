package com.thedarkhorse.account.repository;

import com.thedarkhorse.account.mapper.AccountMapper;
import com.thedarkhorse.account.model.Account;

public class AccountRepositoryImpl implements AccountRepository {
    private final AccountJpaRepository repository;
    private final AccountMapper mapper;

    public AccountRepositoryImpl(AccountJpaRepository repository, AccountMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Account findByUsername(String username) {
        return repository.findByUsername(username)
                .map(mapper::toAccount)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @Override
    public Account save(Account account) {
        return mapper.toAccount(repository.save(mapper.toAccountEntity(account)));
    }
}
