package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2023/8/16 22:23
 */

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String target() {
        return "target";
    }

    @RequestMapping("/file")
    public String file() {
        return "file";
    }
}
