package com.train.mapper;

import com.train.pojo.ClassHistory;

public interface ClassHistoryMapper {
    int deleteByPrimaryKey(String chId);

    int insert(ClassHistory record);

    int insertSelective(ClassHistory record);

    ClassHistory selectByPrimaryKey(String chId);

    int updateByPrimaryKeySelective(ClassHistory record);

    int updateByPrimaryKey(ClassHistory record);
}