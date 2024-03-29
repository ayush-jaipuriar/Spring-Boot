package com.ayush.initializerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/workout")
    public String getMethodName() {
        return new String("Lets run a 5k marathon");
    }
    

}
