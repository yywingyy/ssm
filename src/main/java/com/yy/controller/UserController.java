package com.yy.controller;

import com.yy.entity.User;
import com.yy.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yy on 2017/2/5.
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {

    @Resource
    private IUserService userService;

    @RequestMapping("/login")
    public String userLogin(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.userLogin(username);
        if(user!=null){
            return "userIndex";
        }else {
            return "login";
        }
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;
    }
}
