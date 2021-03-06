package lll.service.Impl;

import lll.dao.IAccountDao;
import lll.dao.Impl.AccountDaoImpl;
import lll.domain.Account;
import lll.service.IAccountService;

import java.util.List;

public class IAccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao=accountDao;
    }

    @Override
    public List<Account> findAllAcount() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
