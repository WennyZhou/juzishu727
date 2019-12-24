package com.juzishu727.controller.funconfig.proptool;

import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.service.ModuleCorrelationService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ModuleCorrelationController {

    @Autowired
    private ModuleCorrelationService mService;

    @PostMapping("/propTool/mcorrelation_list")
    @ResponseBody
    public PageHelper<ModuleCorrelation> findCorrelationList(ModuleCorrelation corre){
        PageHelper<ModuleCorrelation> pageHelper = new PageHelper<>();

        List<ModuleCorrelation> corrs = mService.selectList(corre);
        pageHelper.setRows(corrs);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 去添加
     * Get请求 <a></a>链接
     */
    @GetMapping("/propTool/mcorrelation")
    public String toAdd() {
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modcorre/correlation_edit";
    }

    /**
     * 添加
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/propTool/mcorrelation")
    public String addModuleCorrelation(ModuleCorrelation corre) {
        mService.addModuleCorrelation(corre);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool/correlation";
    }

    /**
     * 去更新页面
     * Get请求
     * <a></a>链接
     */
    @GetMapping("/propTool/mcorrelation/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        ModuleCorrelation correlation = mService.selectById(id);
        model.addAttribute("info", correlation);
        return "/elevatorsystem/functionconfiguration/propertymodeltool/modcorre/correlation_edit";
    }

    /**
     * 更新
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/propTool/mcorrelation")
    public String updateModuleCorrelation(ModuleCorrelation corre) {
        mService.updateModuleCorrelation(corre);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool/correlation";
    }

    /**
     * 删除
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/propTool/mcorrelation/{id}")
    public String deleteModuleCorrelation(@PathVariable Integer id) {
        mService.deleteModuleCorrelation(id);
        //重定向
        return "redirect:/propTool/correlation";
    }

}
