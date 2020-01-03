package com.juzishu727.controller.funconfig.proptool;


import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.ModuleBasicInfo;
import com.juzishu727.bean.ModuleConstraint;
import com.juzishu727.bean.ModuleFeatureParam;
import com.juzishu727.service.ModuleBasicInfoService;
import com.juzishu727.service.ModuleConstraintService;
import com.juzishu727.service.ModuleFeaParamService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ModuleConstraintController {

    @Autowired
    private ModuleConstraintService mService;

    @Autowired
    private ModuleBasicInfoService mbiService;

    @Autowired
    private ModuleFeaParamService mfService;

    @PostMapping("/propTool/mconstraint_list")
    @ResponseBody
    public PageHelper<ModuleConstraint> findFeatureParamList(ModuleConstraint constr){
        PageHelper<ModuleConstraint> pageHelper = new PageHelper<>();

        List<ModuleConstraint> constraints = mService.selectList(constr);
        pageHelper.setRows(constraints);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加用户 全部约束下
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconstraint")
    public String addModuleConstraint(ModuleConstraint constr) {
        mService.addModuleConstraint(constr);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/constraint";
    }
    /**
     * 添加用户 模块-模块约束下
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconstrmm")
    public String addModuleConstraintmm(ModuleConstraint constr) {
        mService.addModuleConstraint(constr);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mm";
    }
    /**
     * 添加用户 模块-模块特征参数约束下
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconstrmf")
    public String addModuleConstraintmf(ModuleConstraint constr) {
        mService.addModuleConstraint(constr);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mf";
    }
    /**
     * 添加用户 模块特征参数-模块特征参数约束下
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconstrff")
    public String addModuleConstraintff(ModuleConstraint constr) {
        mService.addModuleConstraint(constr);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/constraint_ff";
    }
    /**
     * 添加用户 模块内部约束下
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mconstrmself")
    public String addModuleConstraintmself(ModuleConstraint constr) {
        mService.addModuleConstraint(constr);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mself";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    //获取所有模块名称
    @PostMapping("/propTool/mconstraint/module_list")
    @ResponseBody
    public  String getAllModule(){
        List<ModuleBasicInfo> infos = mbiService.selectAll();
        return JSON.toJSONString(infos);
    }

    //获取所有特征参数名称
    @PostMapping("/propTool/mconstraint/feapara_list")
    @ResponseBody
    public  String getAllFeatureParams(){
        List<ModuleFeatureParam> params = mfService.selectAll();
        return JSON.toJSONString(params);
    }

    @PostMapping("/propTool/mconstraint/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        ModuleConstraint constraint = mService.selectById(id);
        return JSON.toJSONString(constraint);
    }

    /**
     * 更新用户 全部约束下
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconstraint")
    public String updateModuleConstraint(ModuleConstraint constr) {
        mService.updateModuleConstraint(constr);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/constraint";
    }
    /**
     * 更新用户 模块-模块约束下
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconstrmm")
    public String updateModuleConstraintmm(ModuleConstraint constr) {
        mService.updateModuleConstraint(constr);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mm";
    }
    /**
     * 更新用户 模块-模块特征参数约束下
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconstrmf")
    public String updateModuleConstraintmf(ModuleConstraint constr) {
        mService.updateModuleConstraint(constr);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mf";
    }
    /**
     * 更新用户 模块特征参数-模块特征参数约束下
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconstrff")
    public String updateModuleConstraintff(ModuleConstraint constr) {
        mService.updateModuleConstraint(constr);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/constraint_ff";
    }
    /**
     * 更新用户 模块内部约束下
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mconstrmself")
    public String updateModuleConstraintmself(ModuleConstraint constr) {
        mService.updateModuleConstraint(constr);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/constraint_mself";
    }


    /**
     * 删除用户 全部约束下
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconstraint/{id}")
    public String deleteModuleConstraint(@PathVariable Integer id) {
        mService.deleteModuleConstraint(id);
        //重定向
        return "redirect:/propTool/constraint";
    }
    /**
     * 删除用户 模块-模块约束下
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconstrmm/{id}")
    public String deleteModuleConstraintmm(@PathVariable Integer id) {
        mService.deleteModuleConstraint(id);
        //重定向
        return "redirect:/propTool/constraint_mm";
    }
    /**
     * 删除用户 模块-模块特征参数约束下
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconstrmf/{id}")
    public String deleteModuleConstraintmf(@PathVariable Integer id) {
        mService.deleteModuleConstraint(id);
        //重定向
        return "redirect:/propTool/constraint_mf";
    }
    /**
     * 删除用户 模块特征参数-模块特征参数约束下
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconstrff/{id}")
    public String deleteModuleConstraintff(@PathVariable Integer id) {
        mService.deleteModuleConstraint(id);
        //重定向
        return "redirect:/propTool/constraint_ff";
    }
    /**
     * 删除用户 模块内部约束下
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mconstrmself/{id}")
    public String deleteModuleConstraintmself(@PathVariable Integer id) {
        mService.deleteModuleConstraint(id);
        //重定向
        return "redirect:/propTool/constraint_mself";
    }

}
