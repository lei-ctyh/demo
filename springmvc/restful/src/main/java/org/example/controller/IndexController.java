package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName IndexController.java
 * @Description TODO
 * @createTime 2023-08-30 11:57:00
 */

@Controller
public class IndexController {

    @GetMapping("/1")
    public String index() {
        return "index";
    }
}
