package com.train.mapper;

import java.util.List;

import com.train.pojo.TimeProperty;

public interface TimePropertyMapper {
	int deleteByPrimaryKey(String tpId);

	int insert(TimeProperty record);

	int insertSelective(TimeProperty record);

	TimeProperty selectByPrimaryKey(String tpId);

	int updateByPrimaryKeySelective(TimeProperty record);

	int updateByPrimaryKey(TimeProperty record);

	List<String> getAllName();

	String selectIdByName(String name);
}