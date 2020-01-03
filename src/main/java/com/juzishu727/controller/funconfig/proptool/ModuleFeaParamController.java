package com.juzishu727.controller.funconfig.proptool;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.ModuleFeatureParam;
import com.juzishu727.service.ModuleFeaParamService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ModuleFeaParamController {

    @Autowired
    private ModuleFeaParamService mService;

    @PostMapping("/propTool/mfeaParam_list")
    @ResponseBody
    public PageHelper<ModuleFeatureParam> findFeatureParamList(ModuleFeatureParam param){
        PageHelper<ModuleFeatureParam> pageHelper = new PageHelper<>();

        List<ModuleFeatureParam> params = mService.selectList(param);
        pageHelper.setRows(params);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mfeaParam")
    public String addModuleFeatureParam(ModuleFeatureParam param) {
        mService.addModuleFeaParam(param);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/feaParam";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    @PostMapping("/propTool/mfeaParam/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        ModuleFeatureParam param = mService.selectById(id);
        return JSON.toJSONString(param);
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mfeaParam")
    public String updateModuleFeatureParam(ModuleFeatureParam param) {
        mService.updateModuleFeaParam(param);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/feaParam";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mfeaParam/{id}")
    public String deleteModuleFeatureParam(@PathVariable Integer id) {
        mService.deleteModuleFeaParam(id);
        //重定向
        return "redirect:/propTool/feaParam";
    }

}
