package com.zmm.testweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/12/25
 * Email:65489469@qq.com
 */
@Controller
public class JspController {

    @GetMapping("/boot/index")
    public String index(Model model){

        model.addAttribute("msg","SpringBoot 集成 jsp功能模块");

        return "index";
    }
}
