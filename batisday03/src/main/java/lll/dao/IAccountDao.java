package lll.dao;

import lll.domain.Account;
import lll.domain.AccountUser;
import lll.domain.User;

import java.util.List;

public interface IAccountDao {
    //查询所有账户,同时还要获取到当前账户的所属信息
    List<Account> findAll();
    //查询所有账户，并且带有用户名和用户地址信息
    List<AccountUser> findAllAccount();


}
