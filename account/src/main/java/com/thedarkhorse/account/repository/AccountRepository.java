package com.thedarkhorse.account.repository;

import com.thedarkhorse.account.model.Account;

public interface AccountRepository {
    Account findByUsername(String username);

    Account save(Account account);
}
