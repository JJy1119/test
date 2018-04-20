package cn.freemud.pay.dao.mapper;

import cn.freemud.pay.dao.model.StoreDepartment;

public interface StoreDepartmentMapper {
    int deleteByPrimaryKey(Integer PKID);

    int insert(StoreDepartment record);

    int insertSelective(StoreDepartment record);

    StoreDepartment selectByPrimaryKey(Integer PKID);

    int updateByPrimaryKeySelective(StoreDepartment record);

    int updateByPrimaryKey(StoreDepartment record);
}