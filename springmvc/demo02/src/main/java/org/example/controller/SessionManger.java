package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName CookieAndSessionController.java
 * @Description TODO
 * @createTime 2023-08-30 11:15:00
 */
@Controller
public class SessionManger {
    @RequestMapping("/getallsessions")
    public String getAllSessions(@CookieValue(required = false) String JSESSIONID) {
        System.out.println(JSESSIONID);
        return "target";
    }
}
