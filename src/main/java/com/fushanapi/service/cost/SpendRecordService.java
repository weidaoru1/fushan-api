package com.fushanapi.service.cost;

import com.fushanapi.model.cost.SpendRecord;
import com.fushanapi.service.BaseService;

public interface SpendRecordService extends BaseService<SpendRecord> {
    int deleteByPrimaryKey(Integer id);
    int insert(SpendRecord record);
    int insertSelective(SpendRecord record);
    SpendRecord selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SpendRecord record);
    int updateByPrimaryKey(SpendRecord record);
    int deleteBySpendId(Integer id);
}
