package com.train.mapper;

import java.util.HashMap;
import java.util.List;

import com.train.pojo.ClassProcess;

public interface ClassProcessMapper {
	int deleteByPrimaryKey(String cpId);

	int insert(ClassProcess record);

	int insertSelective(ClassProcess record);

	ClassProcess selectByPrimaryKey(String cpId);

	int updateByPrimaryKeySelective(ClassProcess record);

	int updateByPrimaryKey(ClassProcess record);

	List<ClassProcess> selectAll();

	List<HashMap> selectAllToApp();

	List<HashMap> selectAllWithCousre();

	List<HashMap> selectBySelection(HashMap map);
}