package com.juzishu727.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ElevatorController {

    /**
     * 去系统首页
     * @return
     */
    @RequestMapping("/home")
    public String toSysHome(){
        return "index.html";
    }

    /**
     * 去电梯定制系统首页
     * @return
     */
    @RequestMapping("/elevSys")
    public String toHome(){
        return "/elevatorsystem/home/list.html";
    }

    /**
     * 去模块属性建模工具首页
     * 默认首页显示模块基本信息
     * @return
     */
    @RequestMapping("/propTool")
    public String toPropToolHome(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/list.html";
    }

    /**
     * 去模块属性建模工具下的模块特征参数页面
     * @return
     */
    @RequestMapping("/propTool/feaParam")
    public String toConfParamPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/feaparam/list.html";
    }

}
