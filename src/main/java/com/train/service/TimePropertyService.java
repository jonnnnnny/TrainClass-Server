package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.TimePropertyMapper;

@Service
public class TimePropertyService {
	@Autowired
	private TimePropertyMapper tpMapper;

	/**
	 * 获取所有时间性质名称的集合
	 * 
	 * @return
	 */
	public List<String> getAllTpName() {
		return tpMapper.getAllName();
	}

	/**
	 * 获取名称对应的id
	 */
	public String getTpIdByName(String name) {
		return tpMapper.selectIdByName(name);
	}
}
