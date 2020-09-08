package lll.controller;

import lll.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/user")
public class UserController {

    //string 响应
    @RequestMapping("/testString")
    public String testString(Model model){
        User user = new User();
        //调用service查出的结果
        user.setPassword("123");
        user.setUsername("dd");
        user.setAge(13);
        //model对象会存储在requset中
        model.addAttribute("user",user);
        return "success";
    }


    @RequestMapping("/void")
    public void testVoid(HttpServletRequest request,HttpServletResponse response) throws Exception {
        System.out.println("testVoid");

        //请求和转发去相应  自己调用原生的必须写全路径
//          request.getRequestDispatcher("WEB-INF/pages/success.jsp").forward(request,response);
//        response.sendRedirect(request.getContextPath()+"index.jsp");


        response.sendRedirect("/index.jsp");

        //设置中文乱码
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().write("转发");


            return;  //结束方法
    }



    @RequestMapping("/testModleAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModleAndView");
        //返回一个视图
        ModelAndView MAV = new ModelAndView();
        User user = new User();
        user.setPassword("123");
        user.setUsername("MAV");
        user.setAge(13);
        MAV.addObject("user",user);
        MAV.setViewName("success");
        return MAV;
    }

    @RequestMapping("/test")
    public String testFOR(){
        System.out.println("testFOR");
        //重定向    不写时为转发
        //重定向时：定向到webapp中    转发时：转发到WEB—INF.pages中
        return "redirect:/index.jsp";

    }

}
