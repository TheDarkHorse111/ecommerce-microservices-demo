package com.thedarkhorse.account.service;

import com.thedarkhorse.account.model.Account;

public interface AccountService {
    Account createAccount(Account account);

    Account getAccountByUsername(String username);
}
