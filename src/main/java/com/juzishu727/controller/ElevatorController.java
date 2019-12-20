package com.juzishu727.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElevatorController {

    @RequestMapping("/elevSys")
    public String toHome(){
        return "/home/list.html";
    }

}
