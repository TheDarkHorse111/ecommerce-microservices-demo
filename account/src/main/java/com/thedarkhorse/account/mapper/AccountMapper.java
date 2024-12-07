package com.thedarkhorse.account.mapper;

import com.thedarkhorse.account.entity.AccountEntity;
import com.thedarkhorse.account.model.Account;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {CartMapper.class}
)
public interface AccountMapper {

    AccountEntity toAccountEntity(Account account);

    Account toAccount(AccountEntity accountEntity);
}
