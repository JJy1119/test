package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPlatform;

public interface PayPlatformMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayPlatform record);

    int insertSelective(PayPlatform record);

    PayPlatform selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayPlatform record);

    int updateByPrimaryKey(PayPlatform record);
}