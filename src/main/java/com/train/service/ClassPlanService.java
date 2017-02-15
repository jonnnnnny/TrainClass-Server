package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.ClassPlanMapper;

@Service
public class ClassPlanService {
	@Autowired
	private ClassPlanMapper classPlanMapper;

	public List getAllPlan() {
		return classPlanMapper.selectAllWithCourseInfo();
	}
}
