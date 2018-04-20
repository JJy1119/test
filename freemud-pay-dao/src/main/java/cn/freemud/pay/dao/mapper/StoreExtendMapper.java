package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.StoreExtend;

public interface StoreExtendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StoreExtend record);

    int insertSelective(StoreExtend record);

    StoreExtend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StoreExtend record);

    int updateByPrimaryKey(StoreExtend record);
}