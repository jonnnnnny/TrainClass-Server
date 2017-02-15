package com.train.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.ClassProcessMapper;

@Service(value = "classProcessService")
public class ClassProcessService {
	@Autowired
	private ClassProcessMapper cpMapper;

	public List<HashMap> getAllCpInfo() {
		return cpMapper.selectAllToApp();
	}

	public List<HashMap> getAlllCprocessInfoWithCourse() {
		return cpMapper.selectAllWithCousre();
	}

	public List<HashMap> getCprocessInfoBySelection(HashMap map) {
		// TODO Auto-generated method stub
		return cpMapper.selectBySelection(map);
	}
}
