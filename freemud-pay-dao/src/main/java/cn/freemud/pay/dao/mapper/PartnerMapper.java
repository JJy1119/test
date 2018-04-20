package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.Partner;

public interface PartnerMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Partner record);

    int insertSelective(Partner record);

    Partner selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}