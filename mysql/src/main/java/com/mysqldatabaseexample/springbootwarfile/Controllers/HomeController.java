package com.mysqldatabaseexample.springbootwarfile.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "SpringBoot .WAR file - MySQL";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
