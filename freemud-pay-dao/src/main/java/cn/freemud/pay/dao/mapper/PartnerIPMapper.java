package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PartnerIP;

public interface PartnerIPMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(PartnerIP record);

    int insertSelective(PartnerIP record);

    PartnerIP selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(PartnerIP record);

    int updateByPrimaryKey(PartnerIP record);
}