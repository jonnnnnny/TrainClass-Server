package com.train.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.UserMapper;
import com.train.pojo.User;

@Service(value = "studentService")
public class StudentService {

	@Autowired
	private UserMapper userMapper;

	public int login(String phone, String password) {
		// TODO Auto-generated method stub
		if (userMapper.selectByPrimaryKey(phone) == null) {
			return -1;// 用户不存在
		}
		User user = new User();
		user.setuPhone(phone);
		user.setuPassword(password);
		if (userMapper.selectByPhoneAndPassword(user) == null) {
			return 0;// 密码错误
		}
		return 1;// 登陆成功
	}

}
