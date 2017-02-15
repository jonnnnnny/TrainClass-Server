package com.train.mapper;

import com.train.pojo.Scheme;

public interface SchemeMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Scheme record);

    int insertSelective(Scheme record);

    Scheme selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Scheme record);

    int updateByPrimaryKey(Scheme record);
}