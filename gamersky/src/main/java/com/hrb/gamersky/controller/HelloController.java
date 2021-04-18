package com.hrb.gamersky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanghaoji
 * @date 2021/04/18
 */

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String putHello() {
        System.err.println("hello");

        return "index";
    }

}
