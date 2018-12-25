package com.zmm.testweb.controller;

import com.zmm.testweb.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/12/25
 * Email:65489469@qq.com
 */
@RestController
public class MVCController {


    @GetMapping("/boot/user")
    public Object getUser(){

        User user = new User();
        user.setId(100);
        user.setName("曹操");

        return user;
    }

}
