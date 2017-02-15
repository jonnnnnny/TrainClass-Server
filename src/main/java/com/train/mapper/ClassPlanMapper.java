package com.train.mapper;

import java.util.List;

import com.train.pojo.ClassPlan;

public interface ClassPlanMapper {
	int deleteByPrimaryKey(String cpId);

	int insert(ClassPlan record);

	int insertSelective(ClassPlan record);

	ClassPlan selectByPrimaryKey(String cpId);

	int updateByPrimaryKeySelective(ClassPlan record);

	int updateByPrimaryKey(ClassPlan record);

	List selectAllWithCourseInfo();

	List selectAll();

}