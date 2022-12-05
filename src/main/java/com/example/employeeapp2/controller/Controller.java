package com.example.employeeapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Employee Homepage";
    }

    @GetMapping("/add")
    public String AddEmployee(){
        return "ADD EMPLOYEE";
    }

    @GetMapping("/search")
    public String SearchEmployee(){
        return "Search Employee";
    }

    @GetMapping("/edit")
    public String EditEmployee(){
        return "Edit Employee";
    }

    @GetMapping("/view")
    public String ViewEmployee(){
        return "View Employee";
    }

    @GetMapping("/delete")
    public String DeleteEmployee(){
        return "Delete Employee";
    }


}
