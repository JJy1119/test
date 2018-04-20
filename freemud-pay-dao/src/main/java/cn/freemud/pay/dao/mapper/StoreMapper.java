package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.Store;

public interface StoreMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}