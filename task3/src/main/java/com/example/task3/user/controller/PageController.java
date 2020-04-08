package com.example.task3.user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.task3.user.entity.User;
import com.example.task3.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @Autowired
    IUserService userService;
    //分页
    @RequestMapping(value = "/findAll/{pageNo}/{pageSize}")
    public Object findAll(@PathVariable("pageNo") int pageNo , @PathVariable("pageSize") int pageSize){
        IPage<User> page = new Page<>(pageNo, pageSize);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        User student = new User();
        student.setName("秦锦玉");
        wrapper.setEntity(student);
        return userService.page(page,wrapper);
    }
}
