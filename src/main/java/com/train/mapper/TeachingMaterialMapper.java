package com.train.mapper;

import com.train.pojo.TeachingMaterial;

public interface TeachingMaterialMapper {
    int deleteByPrimaryKey(String tmId);

    int insert(TeachingMaterial record);

    int insertSelective(TeachingMaterial record);

    TeachingMaterial selectByPrimaryKey(String tmId);

    int updateByPrimaryKeySelective(TeachingMaterial record);

    int updateByPrimaryKey(TeachingMaterial record);
}