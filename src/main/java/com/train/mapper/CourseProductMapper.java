package com.train.mapper;

import java.util.List;

import com.train.pojo.CourseProduct;

public interface CourseProductMapper {
	int deleteByPrimaryKey(String cpId);

	int insert(CourseProduct record);

	int insertSelective(CourseProduct record);

	CourseProduct selectByPrimaryKey(String cpId);

	int updateByPrimaryKeySelective(CourseProduct record);

	int updateByPrimaryKey(CourseProduct record);

	List<String> selectAllCousreProductName();

	String selectIdByName(String name);
}