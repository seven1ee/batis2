package lll.test;

import lll.domain.Account;
import lll.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Testdd {
    private  ApplicationContext ac;
    private  IAccountService as;
    @Test
    public  void testFindAll(){
        ac= new ClassPathXmlApplicationContext("Bean.xml");
        as= ac.getBean("accountService", IAccountService.class);
        List<Account> allAcount = as.findAllAcount();
        for (Account account:allAcount
             ) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindById(){
        ac= new ClassPathXmlApplicationContext("Bean.xml");
        as= ac.getBean("accountService", IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        ac= new ClassPathXmlApplicationContext("Bean.xml");
        as= ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setName("xiaoya");
        account.setMoney(300f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdate(){
        ac= new ClassPathXmlApplicationContext("Bean.xml");
        as= ac.getBean("accountService", IAccountService.class);
        Account account = as.findAccountById(5);
        account.setName("zzm");
        account.setMoney(1f);
        as.updateAccount(account);
    }

    @Test
    public void testDel(){
        ac= new ClassPathXmlApplicationContext("Bean.xml");
        as= ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(5);
    }
}
