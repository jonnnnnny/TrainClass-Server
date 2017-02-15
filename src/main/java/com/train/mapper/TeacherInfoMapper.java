package com.train.mapper;

import com.train.pojo.TeacherInfo;

public interface TeacherInfoMapper {
    int deleteByPrimaryKey(String tiId);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    TeacherInfo selectByPrimaryKey(String tiId);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);
}