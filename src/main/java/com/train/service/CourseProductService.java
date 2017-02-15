package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.CourseProductMapper;

@Service
public class CourseProductService {
	@Autowired
	private CourseProductMapper cpMapper;

	/**
	 * 获取所有的课程产品的名称
	 * 
	 * @return
	 */
	public List<String> getAllCourseProductName() {
		return cpMapper.selectAllCousreProductName();
	}

	/**
	 * 获取课程产品名称对应的id
	 */
	public String getCourseProductIdByName(String name) {
		return cpMapper.selectIdByName(name);
	}
}
