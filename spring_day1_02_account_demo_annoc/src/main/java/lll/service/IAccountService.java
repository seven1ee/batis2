package lll.service;

import lll.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAllAcount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);
}
