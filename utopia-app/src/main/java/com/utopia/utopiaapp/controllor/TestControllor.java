package com.utopia.utopiaapp.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllor {
    @RequestMapping("/test")
    public String test(){
        return "111";
    }
}
