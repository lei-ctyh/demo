package org.example.controller;

import org.example.dao.EmployeeDao;
import org.example.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName EmployeeController.java
 * @Description TODO
 * @createTime 2023-08-30 13:15:00
 */

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String queryEmpAll(Model model) {
        model.addAttribute("employeeList",employeeDao.getAll());
        return "employee_list";
    }


    @DeleteMapping("/employee/{id}")
    public String queryEmpAll(Integer id) {
        employeeDao.delete(id);
        return "employee_list";
    }
}
