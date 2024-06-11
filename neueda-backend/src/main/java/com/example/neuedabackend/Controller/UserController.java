package com.example.neuedabackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping("/buy")
    public String buyStock(@RequestParam(value="name") String name){
        return String.format("Successfully bought %s stock!",name );
    }

    @GetMapping("/sell")
    public String sellStock(@RequestParam(value="name") String name){
        return String.format("Successfully sold %s stock!",name);
    }




    




}
