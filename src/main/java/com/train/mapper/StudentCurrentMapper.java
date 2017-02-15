package com.train.mapper;

import java.util.HashMap;

import com.train.pojo.StudentCurrent;

public interface StudentCurrentMapper {
	int deleteByPrimaryKey(String scId);

	int insert(StudentCurrent record);

	int insertSelective(StudentCurrent record);

	StudentCurrent selectByPrimaryKey(String scId);

	int updateByPrimaryKeySelective(StudentCurrent record);

	int updateByPrimaryKey(StudentCurrent record);

	int updateByPrimaryKeySelectiveWithHashMap(HashMap map);

	Object selectByPhone(HashMap map);
}