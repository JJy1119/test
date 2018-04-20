package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PartnerSetting;

public interface PartnerSettingMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(PartnerSetting record);

    int insertSelective(PartnerSetting record);

    PartnerSetting selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(PartnerSetting record);

    int updateByPrimaryKey(PartnerSetting record);
}