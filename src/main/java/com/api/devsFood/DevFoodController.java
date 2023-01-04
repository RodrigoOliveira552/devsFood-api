package com.api.devsFood;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DevFoodController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Teste rodando!";
    }

}