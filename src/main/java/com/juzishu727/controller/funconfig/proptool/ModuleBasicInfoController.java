package com.juzishu727.controller.funconfig.proptool;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.ModuleBasicInfo;
import com.juzishu727.service.ModuleBasicInfoService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;


@Controller
public class ModuleBasicInfoController {

    @Autowired
    private ModuleBasicInfoService mService;

    @PostMapping("/mbasicInfo_list")
    @ResponseBody
    public PageHelper<ModuleBasicInfo> findBasicInfoList(ModuleBasicInfo info){
        PageHelper<ModuleBasicInfo> pageHelper = new PageHelper<>();

        List<ModuleBasicInfo> infos = mService.selectList(info);
        pageHelper.setRows(infos);

        Integer total = mService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }


    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/mbasicInfo")
    public String addModuleBasicInfo(ModuleBasicInfo info) {
        mService.addModuleBasicInfo(info);
        //重定向,发送请求实现查询所有用户
        return "redirect:/propTool";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    @PostMapping("/mbasicInfo/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        ModuleBasicInfo info = mService.selectById(id);
        return JSON.toJSONString(info);
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/mbasicInfo")
    public String updateModuleBasicInfo(ModuleBasicInfo info) {
        mService.updateModuleBasicInfo(info);
        //重定向，发送请求实现查询所有用户
        return "redirect:/propTool";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/mbasicInfo/{id}")
    public String deleteModuleBasicInfo(@PathVariable Integer id) {
        mService.deleteModuleBasicInfo(id);
        //重定向
        return "redirect:/propTool";
    }

}
