package com.train.mapper;

import java.util.List;

import com.train.pojo.ClassScheme;

public interface ClassSchemeMapper {
	int deleteByPrimaryKey(String csId);

	int insert(ClassScheme record);

	int insertSelective(ClassScheme record);

	ClassScheme selectByPrimaryKey(String csId);

	int updateByPrimaryKeySelective(ClassScheme record);

	int updateByPrimaryKey(ClassScheme record);

	List<ClassScheme> selectAll();
	
}