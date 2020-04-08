package com.example.task3.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.task3.user.entity.User;
import com.example.task3.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Steven
 * @since 2020-03-30
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //增
    @RequestMapping("/addUser")
    public String addStudent(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@ModelAttribute(value="user") User user) {
        userService.save(user);
        return "add";
    }

    //删
    @RequestMapping("/deleteUser")
    public void deleteUser(){
        userService.removeById(10153140);
    }

    //改
    @RequestMapping("/updateUser")
    public void updateUser(){
        User user = new User();
        user.setId(10153139);
        user.setName("刘金琳");
        userService.updateById(user);
    }

    //查
    @RequestMapping("/selectUser")
    public String selectUser(){
        User user = userService.getById(10153136);
        return user.getName();
    }




}
