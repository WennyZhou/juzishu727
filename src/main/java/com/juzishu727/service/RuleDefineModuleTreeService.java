package com.juzishu727.service;

import com.juzishu727.bean.Module;
import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.util.TreeNode;

import java.util.List;

public interface RuleDefineModuleTreeService {

    List<TreeNode> getTree(Module module);

    List<TreeNode> getSubTree(Module module);
}
