package com.example.neuedabackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
///@RequestMapping("api/users")
public class UserController {

    //test 
    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("market.html");
        return modelAndView;
    }

    @GetMapping("/buy")
    public String buyStock(@RequestParam(value="name") String name){
        return String.format("Successfully bought %s stock!",name );
    }

    @GetMapping("/sell")
    public String sellStock(@RequestParam(value="name") String name){
        return String.format("Successfully sold %s stock!",name);
    }




    




}
