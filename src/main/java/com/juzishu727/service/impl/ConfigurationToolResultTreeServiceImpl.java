package com.juzishu727.service.impl;

import com.juzishu727.bean.ConfigResult;
import com.juzishu727.dao.ConfigResultDao;
import com.juzishu727.service.ConfigurationToolResultTreeService;
import com.juzishu727.util.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ConfigurationToolResultTreeServiceImpl implements ConfigurationToolResultTreeService {

    @Autowired
    private ConfigResultDao configResultDao;

    @Override
    public List<TreeNode> getTree(ConfigResult result) {
        //查询根节点
        ConfigResult res = configResultDao.selectByFatherEqNull();

        List<TreeNode> tree = new ArrayList<>();
        TreeNode root = new TreeNode();

        root.setText(res.getInstanceName());

        result.setFather(res.getInstanceLabel());
        root.setNodes(getSubTree(result));
        tree.add(root);

        return tree;
    }

    @Override
    public List<TreeNode> getSubTree(ConfigResult result) {
        List<ConfigResult> results =configResultDao.selectByFather(result);

        List<TreeNode> subTree = new ArrayList<>();

        if(results.size() > 0){
            for(ConfigResult res : results)
            {
                TreeNode root = new TreeNode();
                root.setText(res.getInstanceName());

                result.setFather(res.getInstanceLabel());
                root.setNodes(getSubTree(result));
                subTree.add(root);
            }
        }

        return subTree;
    }
}
