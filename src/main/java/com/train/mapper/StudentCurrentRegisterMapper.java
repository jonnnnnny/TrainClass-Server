package com.train.mapper;

import java.util.HashMap;

import com.train.pojo.StudentCurrentRegister;

public interface StudentCurrentRegisterMapper {
	int deleteByPrimaryKey(Integer no);

	int insert(StudentCurrentRegister record);

	int insertSelective(StudentCurrentRegister record);

	StudentCurrentRegister selectByPrimaryKey(Integer no);

	int updateByPrimaryKeySelective(StudentCurrentRegister record);

	int updateByPrimaryKey(StudentCurrentRegister record);

	StudentCurrentRegister selectByStudidAndclassid(HashMap map);
}