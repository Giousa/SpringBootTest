package com.zmm.testweb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2018/12/25
 * Email:65489469@qq.com
 */
@Component//将这个类变成一个组件，就可以在其他类里面进行注入
@PropertySource("config.properties")
@ConfigurationProperties(prefix = "boot")
public class MyConfig {

    private String name;

    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
