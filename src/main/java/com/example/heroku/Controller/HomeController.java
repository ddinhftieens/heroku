package com.example.heroku.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class HomeController {
    @GetMapping("/getListAddress")
    public String getHome(){
        return "address";
    }
}
