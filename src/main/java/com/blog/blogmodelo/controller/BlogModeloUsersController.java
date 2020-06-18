package com.blog.blogmodelo.controller;

import com.blog.blogmodelo.model.Users;
import com.blog.blogmodelo.service.BlogModeloUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogModeloUsersController {

    @Autowired
    BlogModeloUsersService bmus;

    @RequestMapping(value ="/admin/users", method = RequestMethod.GET)
    public ModelAndView getUsers(){
        ModelAndView mv = new ModelAndView("adminUsers");
        List<Users> users = bmus.findAll();
        mv .addObject("users",users);
        return mv;
    }

    @RequestMapping(value = "/admin/newuser", method = RequestMethod.GET)
public String getTeste(){
        return "teste";
    }

}
