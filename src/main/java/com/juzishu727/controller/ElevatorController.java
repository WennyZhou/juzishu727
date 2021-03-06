package com.juzishu727.controller;

import com.juzishu727.bean.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

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
    public String toHome(@ModelAttribute("flag") String flag, Model model){
//        System.out.println(flag);
        model.addAttribute("flag", flag);
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
    public String toFeaParamPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/feaparam/list.html";
    }

    /**
     * 去模块属性建模工具下的模块约束页面 全部约束
     * @return
     */
    @RequestMapping("/propTool/constraint")
    public String toConstraintPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modconst/all_list.html";
    }

    /**
     * 去模块属性建模工具下的模块约束页面 模块-模块约束
     * @return
     */
    @RequestMapping("/propTool/constraint_mm")
    public String toMMConstraintPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modconst/mm_list.html";
    }

    /**
     * 去模块属性建模工具下的模块约束页面 模块-模块特征参数约束
     * @return
     */
    @RequestMapping("/propTool/constraint_mf")
    public String toMFConstraintPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modconst/mf_list.html";
    }

    /**
     * 去模块属性建模工具下的模块约束页面 模块特征参数-模块特征参数约束
     * @return
     */
    @RequestMapping("/propTool/constraint_ff")
    public String toFFConstraintPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modconst/ff_list.html";
    }

    /**
     * 去模块属性建模工具下的模块约束页面 模块内部约束
     * @return
     */
    @RequestMapping("/propTool/constraint_mself")
    public String toMSelfConstraintPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modconst/mself_list.html";
    }

    /**
     * 去模块属性建模工具下的模块关系页面
     * @return
     */
    @RequestMapping("/propTool/correlation")
    public String toCorrelationPageOfPropTool(){
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modcorre/list.html";
    }

    /**
     * 去配置规则定义工具首页
     * @return
     */
    @RequestMapping("/ruleTool")
    public String toRuleToolHome(){
        return "/elevatorsystem/functionconfiguration/ruledefine/list.html";
    }

    /**
     * 去配置规则定义 规则编辑页面 ruleedit
     */
    @RequestMapping("/ruleTool/ruleedit")
    public String toRuleEditPage(){
        return "elevatorsystem/functionconfiguration/ruledefine/ruleedit.html";
    }

    /**
     * 去配置模板创成定义工具首页
     * @return
     */
    @RequestMapping("/templateTool")
    public String toTemplateToolHome(){
        return "/elevatorsystem/functionconfiguration/templateTool/list.html";
    }

    /**
     * 去功能配置工具首页
     * @return
     */
    @RequestMapping("/configurationTool")
    public String toConfigurationToolHome(){
        return "/elevatorsystem/functionconfiguration/configurationTool/list.html";
    }

}
