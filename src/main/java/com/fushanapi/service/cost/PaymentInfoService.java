package com.fushanapi.service.cost;

import com.fushanapi.model.cost.PaymentInfo;
import com.fushanapi.service.BaseService;

import java.util.List;

public interface PaymentInfoService extends BaseService<PaymentInfo> {
    int deleteByPrimaryKey(Integer key);
    PaymentInfo selectByPrimaryKey(Integer key);
    List<PaymentInfo> queryList(PaymentInfo entity);
    List<PaymentInfo> queryListAll();
    int insertSelective(PaymentInfo entity);
    int updateByPrimaryKey(PaymentInfo entity);
}
