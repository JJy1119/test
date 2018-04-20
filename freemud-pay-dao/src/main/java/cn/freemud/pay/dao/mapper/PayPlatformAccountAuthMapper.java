package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPlatformAccountAuth;

public interface PayPlatformAccountAuthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PayPlatformAccountAuth record);

    int insertSelective(PayPlatformAccountAuth record);

    PayPlatformAccountAuth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PayPlatformAccountAuth record);

    int updateByPrimaryKey(PayPlatformAccountAuth record);
}