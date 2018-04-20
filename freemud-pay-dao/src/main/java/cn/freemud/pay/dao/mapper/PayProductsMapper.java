package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayProducts;

public interface PayProductsMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PayProducts record);

    int insertSelective(PayProducts record);

    PayProducts selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PayProducts record);

    int updateByPrimaryKey(PayProducts record);
}