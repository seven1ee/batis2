package lll.test;

import lll.domain.Account;
import lll.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Testdd {

    ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
    IAccountService as= ac.getBean("IAccountServiceImpl", IAccountService.class);   //s可以写Impl对应的小写 Impl注解为空
    @Test
    public  void testFindAll(){

        List<Account> allAcount = as.findAllAcount();
        for (Account account:allAcount
             ) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindById(){

        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){

        Account account = new Account();
        account.setName("xiaoya");
        account.setMoney(300f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdate(){

        Account account = as.findAccountById(5);
        account.setName("zzm");
        account.setMoney(1f);
        as.updateAccount(account);
    }

    @Test
    public void testDel(){

        as.deleteAccount(5);
    }
}
