package lll.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequsetParam")
    public String testParam(@RequestParam(name="name") String username,
                            @RequestParam("pass") String password )
    //作用：把请求中的指定名称的参数传递给控制器中的形参赋值
    //1.value(name):请求参数中的名称
    //2.required:请求参数中是否必须提供此参数，默认是true，必须提供
    {
        System.out.println("testRequsetParam");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequsetBody")
    public String testParam(@RequestBody String body)
     //用户获取请求体内容     get方法不可以
     //1.required:是否必须有请求体，默认值是true
    {
        System.out.println("RequestBody");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(value = "sid") String id)
     //拥有绑定url中的占位符的  例如：url中有/delete/{id}   ｛id｝是占位符
     //.value:指定url中的占位符名称
     //     Restful风格的url:请求路径一样，可以根据不同的请求方式去执行后台的不同方法
    {
        System.out.println("testPathVariable");
        System.out.println(id);
        return "success";
    }
}
