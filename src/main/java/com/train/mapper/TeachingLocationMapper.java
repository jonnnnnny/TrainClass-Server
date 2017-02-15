package com.train.mapper;

import java.util.List;

import com.train.pojo.TeachingLocation;

public interface TeachingLocationMapper {
	int deleteByPrimaryKey(String tlId);

	int insert(TeachingLocation record);

	int insertSelective(TeachingLocation record);

	TeachingLocation selectByPrimaryKey(String tlId);

	int updateByPrimaryKeySelective(TeachingLocation record);

	int updateByPrimaryKey(TeachingLocation record);

	List<String> selectAllName();

	String selectIdByName(String name);
}