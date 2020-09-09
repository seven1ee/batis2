package lll.service;


import lll.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    void saveAccount(Account account);
}
