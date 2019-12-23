package com.juzishu727.controller.elevsyshome;

import com.juzishu727.bean.BasicInfo;
import com.juzishu727.service.BasicInfoService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
     * 去添加
     * Get请求 <a></a>链接
     */
    @GetMapping("/basicInfo")
    public String toAdd() {
        return "elevatorsystem/home/basicinfo_edit";
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/basicInfo")
    public String addBasicInfo(BasicInfo info) {
        basicInfoService.addBasicInfo(info);
        //重定向,发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 去更新页面
     * Get请求
     * <a></a>链接
     */
    @GetMapping("/basicInfo/{id}")
    public String toUpdate(@PathVariable Integer id, Model model) {
        BasicInfo info = basicInfoService.selectById(id);
        model.addAttribute("info", info);
        return "elevatorsystem/home/basicinfo_edit";
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/basicInfo")
    public String updateBasicInfo(BasicInfo info) {
        basicInfoService.updateBasicInfo(info);
        //重定向，发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/basicInfo/{id}")
    public String deleteBasicInfo(@PathVariable Integer id) {
        basicInfoService.deleteBasicInfo(id);
        //重定向
        return "redirect:/elevSys";
    }

}
