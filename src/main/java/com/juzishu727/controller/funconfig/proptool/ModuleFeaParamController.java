package com.juzishu727.controller.funconfig.proptool;

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
     * 去添加
     * Get请求 <a></a>链接
     */
    @GetMapping("/propTool/mfeaParam")
    public String toAdd() {
        return "/elevatorsystem/functionconfiguration/propertymodeltool/feaparam/feaparam_edit";
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
     * 去更新页面
     * Get请求
     * <a></a>链接
     */
    @GetMapping("/propTool/mfeaParam/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        ModuleFeatureParam param = mService.selectById(id);
        model.addAttribute("info", param);
        return "/elevatorsystem/functionconfiguration/propertymodeltool/feaparam/feaparam_edit";
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
