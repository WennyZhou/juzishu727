package com.juzishu727.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropToolController {

    @RequestMapping("/propTool")
    public String toPropToolHome(){
        return "propertymodeltool/list.html";
    }
}
