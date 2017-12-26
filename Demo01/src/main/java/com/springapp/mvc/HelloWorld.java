package com.springapp.mvc;

import com.springapp.mvc.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/26.
 * http://localhost:8089/test2/index.do
 */
@Controller
@RequestMapping("/test2")
public class HelloWorld {
    private Logger logger=Logger.getLogger(this.getClass());
    @RequestMapping("index.do")
    public String toIndex(){
        return "index";
    }
    /*
    @RequestMapping("welcome.do")
    public String  welcome(Model model){
        model.addAttribute("res","hello world");
        return  "welcome";
    }
    */

    @RequestMapping("login.do")
    public String login(User user, Model model){
        System.out.println(user.getUsername());
        logger.info("”√ªß:" + user.getUsername());
        model.addAttribute("user",user);
        return  "welcome";
    }

}
