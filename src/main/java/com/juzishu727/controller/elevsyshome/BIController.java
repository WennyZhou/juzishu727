package com.juzishu727.controller.elevsyshome;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.BasicInfo;
import com.juzishu727.service.BasicInfoService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BIController {

    @Autowired
    private BasicInfoService basicInfoService;

    @PostMapping("/basicInfo_list")
    @ResponseBody
    public PageHelper<BasicInfo> findBasicInfoList(BasicInfo info){
        PageHelper<BasicInfo> pageHelper = new PageHelper<>();

        List<BasicInfo> infos = basicInfoService.selectList(info);
        pageHelper.setRows(infos);

        Integer total = basicInfoService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/basicInfo")
    public String addBasicInfo(BasicInfo info, RedirectAttributes model) {
        basicInfoService.addBasicInfo(info);
        model.addFlashAttribute("flag", "basicInfo");
        //重定向,发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 去更新
     * post请求
     * ajax
     */
    @PostMapping("/basicInfo/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        BasicInfo info = basicInfoService.selectById(id);
        return JSON.toJSONString(info);
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/basicInfo")
    public String updateBasicInfo(BasicInfo info, RedirectAttributes model) {
        basicInfoService.updateBasicInfo(info);
        model.addFlashAttribute("flag", "basicInfo");
        //重定向，发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/basicInfo/{id}")
    public String deleteBasicInfo(@PathVariable Integer id, RedirectAttributes model) {
        basicInfoService.deleteBasicInfo(id);
        model.addFlashAttribute("flag", "basicInfo");
        //重定向
        return "redirect:/elevSys";
    }

}
