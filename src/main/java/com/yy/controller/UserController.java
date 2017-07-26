package com.yy.controller;

import com.yy.entity.User;
import com.yy.service.IUserService;
import com.yy.util.ResultAjax;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;

/**
 * Created by yy on 2017/2/5.
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/login")
    public @ResponseBody ResultAjax userLogin(String uUsername, String uPassword, HttpSession session){
        ResultAjax resultAjax = new ResultAjax();
        User user = userService.userLogin(uUsername,uPassword);
        if(user==null){
            resultAjax.setStatus(1);
            resultAjax.setMessage("用户名不存在");
            return resultAjax;
        }
        if (!user.getuPassword().equals(uPassword)){
            resultAjax.setStatus(1);
            resultAjax.setMessage("密码错误");
            return resultAjax;
        }
        resultAjax.setStatus(0);
        resultAjax.setMessage("登录成功");
        resultAjax.setData(user);
        session.setAttribute("user",user);
        return resultAjax;
    }

    @RequestMapping(value="/index")
    public String main(){
        return "/user/index";
    }
}
