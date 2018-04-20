package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayExtentions;

public interface PayExtentionsMapper {
    int deleteByPrimaryKey(Long ID);

    int insert(PayExtentions record);

    int insertSelective(PayExtentions record);

    PayExtentions selectByPrimaryKey(Long ID);

    int updateByPrimaryKeySelective(PayExtentions record);

    int updateByPrimaryKey(PayExtentions record);
}