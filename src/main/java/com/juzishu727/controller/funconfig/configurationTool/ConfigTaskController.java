package com.juzishu727.controller.funconfig.configurationTool;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.ConfigTask;
import com.juzishu727.service.ConfigTaskService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ConfigTaskController {

    @Autowired
    private ConfigTaskService configTaskService;

    @PostMapping("/configTask_list")
    @ResponseBody
    public PageHelper<ConfigTask> findConfigTaskList(ConfigTask task){
        PageHelper<ConfigTask> pageHelper = new PageHelper<>();

        List<ConfigTask> tasks = configTaskService.selectList(task);
        pageHelper.setRows(tasks);

        Integer total = configTaskService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/configTask")
    public String addConfigTask(ConfigTask task) {
        configTaskService.addConfigTask(task);
        //重定向,发送请求实现查询所有用户
        return "redirect:/configurationTool";
    }

    /**
     * 去更新
     * post请求
     * ajax
     */
    @PostMapping("/configTask/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
       ConfigTask task = configTaskService.selectById(id);
        return JSON.toJSONString(task);
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/configTask")
    public String updateConfigTask(ConfigTask task) {
        configTaskService.updateConfigTask(task);
        //重定向，发送请求实现查询所有用户
        return "redirect:/configurationTool";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/configTask/{id}")
    public String deleteConfigTask(@PathVariable Integer id) {
        configTaskService.deleteConfigTask(id);
        //重定向
        return "redirect:/configurationTool";
    }

}
