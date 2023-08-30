package org.example.controller;

import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName TestPojoController.java
 * @Description TODO
 * @createTime 2023-08-30 10:57:00
 */
@Controller
public class TestPojoController {

    @RequestMapping("/testpojo")
    public String testPojo(User user) {
        System.out.println(user.toString());
        return "target";
    }
}
