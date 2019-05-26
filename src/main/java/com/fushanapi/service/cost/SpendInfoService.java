package com.fushanapi.service.cost;

import com.fushanapi.model.cost.SpendInfo;
import com.fushanapi.service.BaseService;

public interface SpendInfoService extends BaseService<SpendInfo> {
    int deleteByPrimaryKey(Integer key);
    SpendInfo selectByPrimaryKey(Integer key);
    int insertSelective(SpendInfo entity);
    int updateByPrimaryKey(SpendInfo entity);
}
