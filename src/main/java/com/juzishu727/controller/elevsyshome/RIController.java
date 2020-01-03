package com.juzishu727.controller.elevsyshome;

import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.ReqInfo;
import com.juzishu727.service.ReqInfoService;
import com.juzishu727.util.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class RIController {

    @Autowired
    private ReqInfoService reqInfoService;

    @PostMapping("/reqInfo_list")
    @ResponseBody
    public PageHelper<ReqInfo> findReqInfoList(ReqInfo info){
        PageHelper<ReqInfo> pageHelper = new PageHelper<>();

        List<ReqInfo> infos = reqInfoService.selectList(info);
        pageHelper.setRows(infos);

        Integer total = reqInfoService.getTotal();
        pageHelper.setTotal(total);

        return pageHelper;
    }

    /**
     * 添加用户
     * post请求
     * <form></form>表单提交post请求
     */
    @PostMapping("/reqInfo")
    public String addReqInfo(ReqInfo info, RedirectAttributes model) {
        reqInfoService.addReqInfo(info);
        model.addFlashAttribute("flag", "reqInfo");
        //重定向,发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 去更新
     * Post请求
     * ajax
     */
    @PostMapping("/reqInfo/{id}")
    @ResponseBody
    public String toUpdate(@PathVariable Integer id) {
        ReqInfo info = reqInfoService.selectById(id);
        return JSON.toJSONString(info);
    }

    /**
     * 更新用户
     * Put请求
     * <form></form>表单提交请求
     */
    @PutMapping("/reqInfo")
    public String updateReqInfo(ReqInfo info, RedirectAttributes model) {
        reqInfoService.updateReqInfo(info);
        model.addFlashAttribute("flag", "reqInfo");
        //重定向，发送请求实现查询所有用户
        return "redirect:/elevSys";
    }

    /**
     * 删除用户
     * Delete请求
     * <form></form>表单提交请求
     */
    @DeleteMapping("/reqInfo/{id}")
    public String deleteReqInfo(@PathVariable Integer id, RedirectAttributes model) {
        reqInfoService.deleteReqInfo(id);
        model.addFlashAttribute("flag", "reqInfo");
        //重定向
        return "redirect:/elevSys";
    }
}
