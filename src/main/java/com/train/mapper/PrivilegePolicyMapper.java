package com.train.mapper;

import com.train.pojo.PrivilegePolicy;

public interface PrivilegePolicyMapper {
    int deleteByPrimaryKey(String no);

    int insert(PrivilegePolicy record);

    int insertSelective(PrivilegePolicy record);

    PrivilegePolicy selectByPrimaryKey(String no);

    int updateByPrimaryKeySelective(PrivilegePolicy record);

    int updateByPrimaryKey(PrivilegePolicy record);
}