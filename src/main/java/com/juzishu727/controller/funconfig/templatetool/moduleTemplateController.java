package com.juzishu727.controller.funconfig.templatetool;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.Module;
import com.juzishu727.service.ModuleTemplateService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class moduleTemplateController {

    @Autowired
    private ModuleTemplateService mService;

    @PostMapping("/templateTool/module_list")
    @ResponseBody
    public PageHelper<Module> findModuleList(Module module){

        PageHelper<Module> pageHelper = new PageHelper<>();

        List<Module> modules = mService.selectList(module);
        pageHelper.setRows(modules);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/templateTool/module")
    public String addModule(Module module) {
        mService.addModule(module);
        //重定向,发送请求实现查询所有用户
        return "redirect:/templateTool";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    @PostMapping("/templateTool/module/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        Module module = mService.selectById(id);
        return JSON.toJSONString(module);
    }

    /**
     * 更新
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/templateTool/module")
    public String updateModule(Module module) {
        mService.updateModule(module);
        //重定向，发送请求实现查询所有用户
        return "redirect:/templateTool";
    }

    /**
     * 删除
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/templateTool/module/{id}")
    public String deleteModule(@PathVariable Integer id) {
        mService.deleteModule(id);
        //重定向
        return "redirect:/templateTool";
    }

}
