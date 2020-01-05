package com.juzishu727.controller.funconfig.ruledefine;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.Module;
import com.juzishu727.bean.Rule;
import com.juzishu727.service.RuleService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @PostMapping("/ruleTool/rules")
    @ResponseBody
    public PageHelper<Rule> findRuleList(Rule rule){
        PageHelper<Rule> pageHelper = new PageHelper<>();

        List<Rule> rules = ruleService.selectList(rule);
        pageHelper.setRows(rules);

        Integer total = ruleService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    @PostMapping("/ruleTool/allrule")
    @ResponseBody
    public PageHelper<Rule> findAllRule(Rule rule){
        PageHelper<Rule> pageHelper = new PageHelper<>();

        List<Rule> rules = ruleService.selectAll(rule);
        pageHelper.setRows(rules);

        Integer total = ruleService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/ruleTool/rule")
    public String addRule(Rule rule) {
        ruleService.addRule(rule);
        //重定向,发送请求实现查询所有用户
        return "redirect:/ruleTool";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    @PostMapping("/ruleTool/rule/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        Rule rule = ruleService.selectById(id);
        return JSON.toJSONString(rule);
    }

    /**
     * 更新
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/ruleTool/rule")
    public String updateRule(Rule rule) {
        ruleService.updateRule(rule);
        //重定向，发送请求实现查询所有用户
        return "redirect:/ruleTool";
    }

    /**
     * 删除
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/ruleTool/rule/{id}")
    public String deleteRule(@PathVariable Integer id) {
        ruleService.deleteRule(id);
        //重定向
        return "redirect:/ruleTool";
    }

}
