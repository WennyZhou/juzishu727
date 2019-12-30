package com.juzishu727.service;

import com.juzishu727.bean.ModuleCorrelation;
import com.juzishu727.util.TreeNode;

import java.util.List;

public interface ModuleCorrelationTreeService {

    List<TreeNode> getTree(ModuleCorrelation corr);

    List<TreeNode> getSubTree(ModuleCorrelation corr);
}
