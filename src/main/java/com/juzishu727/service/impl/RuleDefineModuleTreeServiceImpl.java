package com.juzishu727.service.impl;

import com.juzishu727.bean.Module;
import com.juzishu727.dao.ModuleDao;
import com.juzishu727.service.RuleDefineModuleTreeService;
import com.juzishu727.util.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RuleDefineModuleTreeServiceImpl implements RuleDefineModuleTreeService {

    @Autowired
    private ModuleDao moduleDao;

    @Override

    public List<TreeNode> getTree(Module module) {
        //查询根节点
        Module moduleRoot = moduleDao.selectByFatherEqNull();

        List<TreeNode> tree = new ArrayList<>();
        TreeNode root = new TreeNode();

        root.setText(moduleRoot.getModuleName());

        module.setFather(moduleRoot.getModuleName());
        root.setNodes(getSubTree(module));
        tree.add(root);

        return tree;
    }

    @Override
    public List<TreeNode> getSubTree(Module module) {
        List<Module> modules = moduleDao.selectByFather(module);

        List<TreeNode> subTree = new ArrayList<>();

        if(modules.size() > 0){
            for(Module m : modules)
            {
                TreeNode root = new TreeNode();
                String rootText = m.getModuleName();
                root.setText(rootText);

                module.setFather(rootText);
                root.setNodes(getSubTree(module));
                subTree.add(root);
            }
        }

        return subTree;
    }
}
