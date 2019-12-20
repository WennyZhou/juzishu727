package com.juzishu727.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PTConfParamController {

    @RequestMapping("/propTool/confParam")
    public String toConfParamPageOfPropTool(){
        return "propertymodeltool/confparam/list.html";
    }
}
