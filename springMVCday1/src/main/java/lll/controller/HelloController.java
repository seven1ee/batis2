package lll.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("HelloController");
        return "success";
    }

    @RequestMapping("/hello2")          //不写时默认为value
    public String sayHello2(){
        System.out.println("HelloController2");
        return "success";
    }

    @RequestMapping(value = "/testRequestMapping",params = {"username=hehe"},headers = "Accept")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return "success";
    }
}
