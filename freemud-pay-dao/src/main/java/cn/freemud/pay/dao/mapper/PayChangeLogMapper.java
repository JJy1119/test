package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayChangeLog;

public interface PayChangeLogMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PayChangeLog record);

    int insertSelective(PayChangeLog record);

    PayChangeLog selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PayChangeLog record);

    int updateByPrimaryKey(PayChangeLog record);
}