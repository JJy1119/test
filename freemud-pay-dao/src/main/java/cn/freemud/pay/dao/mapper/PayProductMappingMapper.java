package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.PayProductMapping;

public interface PayProductMappingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayProductMapping record);

    int insertSelective(PayProductMapping record);

    PayProductMapping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayProductMapping record);

    int updateByPrimaryKey(PayProductMapping record);
}