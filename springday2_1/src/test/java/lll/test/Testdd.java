package lll.test;

import lll.config.SpringConfiguration;
import lll.domain.Account;
import lll.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//使用注解的方式加载junit单元测试
    //spring整理junit配置

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "bean.xml")
@ContextConfiguration(classes = SpringConfiguration.class)
public class Testdd {
    @Autowired
    private IAccountService as;

    @Test
    public  void testFindAll(){

        List<Account> allAcount = as.findAllAcount();
        for (Account account:allAcount
             ) {
            System.out.println(account);
        }
    }


//    ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
//    IAccountService as= ac.getBean("IAccountServiceImpl", IAccountService.class);   //s可以写Impl对应的小写 Impl注解为空
//    @Test
//    public  void testFindAll(){
//
//        List<Account> allAcount = as.findAllAcount();
//        for (Account account:allAcount
//             ) {
//            System.out.println(account);
//        }
//    }
//
//    @Test
//    public void testFindById(){
//
//        Account account = as.findAccountById(1);
//        System.out.println(account);
//    }
//
//    @Test
//    public void testSave(){
//
//        Account account = new Account();
//        account.setName("xiaoya");
//        account.setMoney(300f);
//        as.saveAccount(account);
//    }
//
//    @Test
//    public void testUpdate(){
//
//        Account account = as.findAccountById(5);
//        account.setName("zzm");
//        account.setMoney(1f);
//        as.updateAccount(account);
//    }
//
//    @Test
//    public void testDel(){
//
//        as.deleteAccount(5);
//    }
}
