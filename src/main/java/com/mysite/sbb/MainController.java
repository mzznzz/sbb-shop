package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }
    
    @GetMapping("/index")
    public String index2() {
        return "/index";
    }
    
    @GetMapping("/cart")
    public String cart() {
        return "/cart";
    }
    @GetMapping("/wish")
    public String wish() {
        return "/wishlist";
    }
    
    @GetMapping("/detail")
    public String detail() {
        return "/detail";
    }

}
