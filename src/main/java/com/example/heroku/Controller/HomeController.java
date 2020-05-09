package com.example.heroku.Controller;

import com.example.heroku.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;
    @GetMapping("/gethome")
    public List getHome(){
        return homeService.getHome();
    }
}
