package com.juzishu727.service.impl;

import com.juzishu727.bean.ReqInfo;
import com.juzishu727.dao.ReqInfoDao;
import com.juzishu727.service.ReqInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReqInfoServiceImpl implements ReqInfoService {

    @Autowired
    private ReqInfoDao reqInfoDao;

    @Override
    public List<ReqInfo> selectList(ReqInfo info) {
        return reqInfoDao.selectList(info);
    }

    @Override
    public Integer getTotal() {
        return reqInfoDao.getTotal();
    }

    @Override
    public ReqInfo selectById(Integer id) {
        return reqInfoDao.selectById(id);
    }

    @Override
    public void addReqInfo(ReqInfo info) {
        reqInfoDao.addReqInfo(info);
    }

    @Override
    public void updateReqInfo(ReqInfo info) {
        reqInfoDao.updateReqInfo(info);
    }

    @Override
    public void deleteReqInfo(Integer id) {
        reqInfoDao.deleteReqInfo(id);
    }
}
