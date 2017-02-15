package com.train.mapper;

import com.train.pojo.StudentHistoryRegister;

public interface StudentHistoryRegisterMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(StudentHistoryRegister record);

    int insertSelective(StudentHistoryRegister record);

    StudentHistoryRegister selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(StudentHistoryRegister record);

    int updateByPrimaryKey(StudentHistoryRegister record);
}