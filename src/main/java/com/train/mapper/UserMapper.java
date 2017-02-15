package com.train.mapper;

import java.util.HashMap;

import com.train.pojo.User;

public interface UserMapper {
	int deleteByPrimaryKey(String uPhone);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String uPhone);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	HashMap selectByPhoneAndPassword(User user);

	User selectByPhone(HashMap map);

}