package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPromotionArea;

public interface PayPromotionAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayPromotionArea record);

    int insertSelective(PayPromotionArea record);

    PayPromotionArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayPromotionArea record);

    int updateByPrimaryKey(PayPromotionArea record);
}