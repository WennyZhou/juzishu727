package com.juzishu727.dao;

import com.juzishu727.bean.BasicInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicInfoDao {

    List<BasicInfo> selectList(BasicInfo info);

    Integer getTotal();

    BasicInfo selectById(Integer id);

    void addBasicInfo(BasicInfo info);

    void updateBasicInfo(BasicInfo info);

    void deleteBasicInfo(Integer id);

}
