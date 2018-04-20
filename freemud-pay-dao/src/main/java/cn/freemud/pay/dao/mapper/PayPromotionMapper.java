package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayPromotion;

public interface PayPromotionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayPromotion record);

    int insertSelective(PayPromotion record);

    PayPromotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayPromotion record);

    int updateByPrimaryKey(PayPromotion record);
}