package com.zmm.testweb.controller;

import com.zmm.testweb.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/12/25
 * Email:65489469@qq.com
 */
@RestController
public class ConfigController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/boot/config")
    public String config(){

        System.out.println("name = "+name);
        System.out.println("location = "+location);

        return name+location;
    }

    @GetMapping("/boot/myconfig")
    public String myconfig(){

        return myConfig.getName()+"--------"+myConfig.getLocation();
    }
}
