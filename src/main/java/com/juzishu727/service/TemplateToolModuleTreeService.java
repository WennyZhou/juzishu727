package com.juzishu727.service;

import com.juzishu727.bean.Module;
import com.juzishu727.util.TreeNode;

import java.util.List;

public interface TemplateToolModuleTreeService {
    List<TreeNode> getTree(Module module);

    List<TreeNode> getSubTree(Module module);
}
