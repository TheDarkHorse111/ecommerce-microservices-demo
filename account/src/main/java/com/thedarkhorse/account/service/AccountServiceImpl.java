package com.thedarkhorse.account.service;

import com.thedarkhorse.account.model.Account;
import com.thedarkhorse.account.model.Cart;
import com.thedarkhorse.account.repository.AccountRepository;
import com.thedarkhorse.account.repository.CartRepository;
import jakarta.transaction.Transactional;

import static com.thedarkhorse.account.constant.CartStatus.AVAILABLE;

@Transactional
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final CartRepository cartRepository;

    public AccountServiceImpl(AccountRepository accountRepository, CartRepository cartRepository) {
        this.accountRepository = accountRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public Account createAccount(Account account) {
        Account savedAccount = accountRepository.save(account);
        createAccountCart(savedAccount);
        return savedAccount;
    }

    private void createAccountCart(Account savedAccount) {
        Cart cart = new Cart();
        cart.setAccountId(savedAccount.getId());
        cart.setStatus(AVAILABLE);
        cart.setNumberOfItems(0);
        cartRepository.save(cart);
    }

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepository.findByUsername(username);
    }
}
