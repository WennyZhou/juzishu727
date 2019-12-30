package com.juzishu727.controller;
import com.alibaba.fastjson.JSON;
import com.juzishu727.bean.Module;
import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.service.ModuleCorrelationTreeService;
import com.juzishu727.service.RuleDefineModuleTreeService;
import com.juzishu727.util.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {

    @Autowired
    private ModuleCorrelationTreeService moduleCorrelationTreeService;

    @Autowired
    private RuleDefineModuleTreeService rdTreeService;

    /**
     * 测试TreeView控件
     */

    @RequestMapping("/tree")
    public String toTree(){
        return "TreeViewTest.html";
    }

    @RequestMapping("/testTreeView")
    @ResponseBody
    public String testTreeView(@RequestBody ModuleCorrelation corr){

        List<TreeNode> tree = moduleCorrelationTreeService.getTree(corr);
        /*System.out.println(tree);
        System.out.println(JSON.toJSONString(tree).replace("\"nodes\":[],", ""));*/
        return JSON.toJSONString(tree).replace("\"nodes\":[],", "");
    }

    /**
     * 模块建模工具
     * 模块关系管理
     * 更新树结构
     * @return
     */
    @RequestMapping("/propTool/correlation/eleTree")
    @ResponseBody
    public String refreshTreeView(@RequestBody ModuleCorrelation corr){
        List<TreeNode> tree = moduleCorrelationTreeService.getTree(corr);
        return JSON.toJSONString(tree).replace("\"nodes\":[],", "");
    }

    /**
     * 配置规则定义工具
     * @return
     */
    @RequestMapping("/ruleTool/moduleTree")
    @ResponseBody
    public String getTreeView(){
        Module module = new Module();
        List<TreeNode> tree = rdTreeService.getTree(module);
       /* System.out.println(JSON.toJSONString(tree).replace("\"nodes\":[],", ""));*/
        return JSON.toJSONString(tree).replace("\"nodes\":[],", "");
    }
}
