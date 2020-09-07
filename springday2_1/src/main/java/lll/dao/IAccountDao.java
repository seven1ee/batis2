package lll.dao;

import lll.domain.Account;

import java.util.List;

public interface IAccountDao {
    //查询所有
    public List<Account> findAll();
    Account findAccountById(Integer accountId);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer accountId);
}
