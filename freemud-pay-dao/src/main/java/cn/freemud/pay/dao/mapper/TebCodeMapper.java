package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.TebCode;

public interface TebCodeMapper {
    int deleteByPrimaryKey(Integer pkid);

    int insert(TebCode record);

    int insertSelective(TebCode record);

    TebCode selectByPrimaryKey(Integer pkid);

    int updateByPrimaryKeySelective(TebCode record);

    int updateByPrimaryKey(TebCode record);
}