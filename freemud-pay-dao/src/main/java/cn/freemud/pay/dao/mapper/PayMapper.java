package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.Pay;

public interface PayMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}