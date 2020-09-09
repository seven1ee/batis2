package lll.service.Impl;


import lll.dao.IAccountDao;
import lll.domain.Account;
import lll.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/9/8 11:43
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("添加用户");
        accountDao.saveAccount(account);
    }
}
