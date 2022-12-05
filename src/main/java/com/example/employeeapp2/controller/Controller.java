package com.example.employeeapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/")
    public String Homepage(){
        return "Welcome to Employee Homepage";
    }

    @PostMapping("/add")
    public String AddEmployee(){
        return "ADD EMPLOYEE";
    }

    @PostMapping("/search")
    public String SearchEmployee(){
        return "Search Employee";
    }

    @PostMapping("/edit")
    public String EditEmployee(){
        return "Edit Employee";
    }

    @GetMapping("/view")
    public String ViewEmployee(){
        return "View Employee";
    }

    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "Delete Employee";
    }


}
