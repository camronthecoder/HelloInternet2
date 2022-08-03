package com.careerdevs.HelloInternet.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @GetMapping("/")
    private String routeRoute (){
        return "Your requested root";
    }
    @GetMapping("/hello")
    private String Hello (){
        return "hello career devs";
    }

}

