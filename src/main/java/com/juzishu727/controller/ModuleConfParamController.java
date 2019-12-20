package com.juzishu727.controller;

import com.juzishu727.bean.ModuleBasicInfo;
import com.juzishu727.bean.ModuleConfParam;
import com.juzishu727.service.ModuleConfParamService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.awt.SystemColor.info;

@Controller
public class ModuleConfParamController {

    @Autowired
    private ModuleConfParamService mService;

    @PostMapping("/propTool/mconfParam_list")
    @ResponseBody
    public PageHelper<ModuleConfParam> findBasicInfoList(ModuleConfParam param){
        PageHelper<ModuleConfParam> pageHelper = new PageHelper<>();

        List<ModuleConfParam> params = mService.selectList(param);
        pageHelper.setRows(params);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 去添加
     * Get请求 <a></a>链接
     */
    @GetMapping("/propTool/mconfParam")
    public String toAdd() {
        return "propertymodeltool/confparam/confparam_edit";
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconfParam")
    public String addModuleBasicInfo(ModuleConfParam param) {
        mService.addModuleConfParam(param);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/confParam";
    }

    /**
     * 去更新页面
     * Get请求
     * <a></a>链接
     */
    @GetMapping("/propTool/mconfParam/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        ModuleConfParam param = mService.selectById(id);
        System.out.println(param);
        model.addAttribute("info", param);
        return "propertymodeltool/confparam/confparam_edit";
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconfParam")
    public String updateModuleBasicInfo(ModuleConfParam param) {
        mService.updateModuleConfParam(param);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/confParam";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconfParam/{id}")
    public String deleteModuleBasicInfo(@PathVariable Integer id) {
        mService.deleteModuleConfParam(id);
        //重定向
        return "redirect:/propTool/confParam";
    }

}
