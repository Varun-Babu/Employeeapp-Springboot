package com.example.employeeapp2.controller;

import com.example.employeeapp2.Dao.EmployeeDao;
import com.example.employeeapp2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeDao dao;

    @PostMapping("/")
    public String Homepage(){
        return "Welcome to Employee Homepage";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> Add(@RequestBody Employee e){
        dao.save(e);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @PostMapping("/search")
    public String SearchEmployee(){
        return "Search Employee";
    }

    @PostMapping("/edit")
    public String EditEmployee(){
        return "Edit Employee";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> ViewEmployee(){

        return (List<Employee>) dao.findAll();
    }

    @PostMapping("/delete")
    public String DeleteEmployee(){
        return "Delete Employee";
    }


}
