package com.xie.spring.web.controler;

import com.xie.spring.web.vo.ResponeVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AccountController {

    @RequestMapping("login")
    @ResponseBody
    public ResponeVo login(String account, String password){
        System.out.println("account:"+account);
        System.out.println("password:"+password);
        return ResponeVo.success();
    }

    @RequestMapping("home")
    public String home(){
        System.out.println("home");
        return "home_page.jsp";
    }

}
