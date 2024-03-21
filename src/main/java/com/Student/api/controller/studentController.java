package com.Student.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {


    @GetMapping("/student/details")

    public String getStudent(){
        return "Hello";
    }

}
