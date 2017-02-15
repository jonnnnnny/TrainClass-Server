package com.train.mapper;

import com.train.pojo.StudentRegisterType;

public interface StudentRegisterTypeMapper {
    int deleteByPrimaryKey(String srtId);

    int insert(StudentRegisterType record);

    int insertSelective(StudentRegisterType record);

    StudentRegisterType selectByPrimaryKey(String srtId);

    int updateByPrimaryKeySelective(StudentRegisterType record);

    int updateByPrimaryKey(StudentRegisterType record);
}