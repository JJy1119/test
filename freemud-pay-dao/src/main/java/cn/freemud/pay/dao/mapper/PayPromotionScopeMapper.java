package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPromotionScope;

public interface PayPromotionScopeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayPromotionScope record);

    int insertSelective(PayPromotionScope record);

    PayPromotionScope selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayPromotionScope record);

    int updateByPrimaryKey(PayPromotionScope record);
}