package com.springsample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/data")
public class springSampleController {

    @GetMapping ("/postdetails")
    public String getMessage() {
        return "Hello this is sindhuja here";
    }


}
