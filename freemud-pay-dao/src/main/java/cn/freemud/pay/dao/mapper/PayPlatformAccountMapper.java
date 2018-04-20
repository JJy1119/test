package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPlatformAccount;

public interface PayPlatformAccountMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(PayPlatformAccount record);

    int insertSelective(PayPlatformAccount record);

    PayPlatformAccount selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(PayPlatformAccount record);

    int updateByPrimaryKey(PayPlatformAccount record);
}