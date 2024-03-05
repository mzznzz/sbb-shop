package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
    	// Spring Boot Devtools를 설치
        return "Hello Spring Boot Board";
    }
}