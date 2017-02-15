package com.train.mapper;

import java.util.HashMap;

import com.train.pojo.StudentHistory;

public interface StudentHistoryMapper {
	int deleteByPrimaryKey(String shId);

	int insert(StudentHistory record);

	int insertSelective(StudentHistory record);

	StudentHistory selectByPrimaryKey(String shId);

	int updateByPrimaryKeySelective(StudentHistory record);

	int updateByPrimaryKey(StudentHistory record);

	int updateByPrimaryKeySelectiveWithHashMap(HashMap map);

	Object selectByPhone(HashMap map);
}