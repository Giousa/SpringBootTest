package com.zmm.testweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/12/25
 * Email:65489469@qq.com
 */
@RestController
public class HelloController {

    @RequestMapping("/boot/hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }

    @GetMapping("/boot/hello2")
    public String hello2(){
        return "hello2";
    }
}
