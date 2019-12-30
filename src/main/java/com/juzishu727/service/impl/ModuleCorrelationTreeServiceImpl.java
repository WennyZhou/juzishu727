package com.juzishu727.service.impl;
import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.dao.ModuleCorrelationDao;
import com.juzishu727.service.ModuleCorrelationTreeService;
import com.juzishu727.util.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ModuleCorrelationTreeServiceImpl implements ModuleCorrelationTreeService {

    @Autowired
    private ModuleCorrelationDao moduleCorrelationDao;

    @Override
    public List<TreeNode> getTree(ModuleCorrelation corr) {
        //查询根节点
        ModuleCorrelation correlation = moduleCorrelationDao.selectByFatherEqNull();
        String rootText = correlation.getModuleName();

        List<TreeNode> tree = new ArrayList<>();
        TreeNode root = new TreeNode();
        root.setText(rootText);

        corr.setFather(rootText);
        root.setNodes(getSubTree(corr));
        tree.add(root);

        return tree;
    }

    @Override
    public List<TreeNode> getSubTree(ModuleCorrelation corr) {

        List<ModuleCorrelation> corrs = moduleCorrelationDao.selectByFather(corr);

        List<TreeNode> subTree = new ArrayList<>();

        if(corrs.size() > 0){
            for(ModuleCorrelation c : corrs)
            {
                TreeNode root = new TreeNode();
                String rootText = c.getModuleName();
                root.setText(rootText);

                corr.setFather(rootText);
                root.setNodes(getSubTree(corr));
                subTree.add(root);
            }
        }

        return subTree;
    }
}
