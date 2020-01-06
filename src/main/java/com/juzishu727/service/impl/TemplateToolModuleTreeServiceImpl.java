package com.juzishu727.service.impl;

import com.juzishu727.bean.Module;
import com.juzishu727.dao.ModuleTemplateDao;
import com.juzishu727.service.TemplateToolModuleTreeService;
import com.juzishu727.util.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TemplateToolModuleTreeServiceImpl implements TemplateToolModuleTreeService {

    @Autowired
    private ModuleTemplateDao moduleTemplateDao;

    @Override
    public List<TreeNode> getTree(Module module) {
        //查询根节点
        Module moduleRoot = moduleTemplateDao.selectByFatherEqNull(module);

        List<TreeNode> tree = new ArrayList<>();
        TreeNode root = new TreeNode();

        root.setText(moduleRoot.getModuleName());

        module.setFather(moduleRoot.getModuleLabel());
        root.setNodes(getSubTree(module));
        tree.add(root);

        return tree;
    }

    @Override
    public List<TreeNode> getSubTree(Module module) {
        List<Module> modules = moduleTemplateDao.selectByFather(module);

        List<TreeNode> subTree = new ArrayList<>();

        if(modules.size() > 0){
            for(Module m : modules)
            {
                TreeNode root = new TreeNode();
                root.setText(m.getModuleName());

                module.setFather(m.getModuleLabel());
                root.setNodes(getSubTree(module));
                subTree.add(root);
            }
        }

        return subTree;
    }
}
