package com.train.mapper;

import java.util.List;

import com.train.pojo.TeachingMode;

public interface TeachingModeMapper {
	int deleteByPrimaryKey(String tmId);

	int insert(TeachingMode record);

	int insertSelective(TeachingMode record);

	TeachingMode selectByPrimaryKey(String tmId);

	int updateByPrimaryKeySelective(TeachingMode record);

	int updateByPrimaryKey(TeachingMode record);

	List<String> selectAllName();

	String selectIdByBfName(String name);
}