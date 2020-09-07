package lll.controller;


import lll.domain.Account;
import lll.domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/param")
public class ParaController {
    @RequestMapping("/testparam")
    public String testParam(String username,String password){
        System.out.println("testparam执行了");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("saveAccount");
        System.out.println(account);
        return "success";
    }


    //自定义类型转换器
    @RequestMapping("/saveUser")
    public String saveAccount(User user){
        System.out.println("saveAccount");
        System.out.println(user);
        return "success";
    }

    //原生serletapi的使用
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("testServlet");
        System.out.println(request);
        String hehe = request.getParameter("hehe");
        System.out.println(hehe);
        return "success";
    }

}
