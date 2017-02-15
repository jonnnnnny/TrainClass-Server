package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.TeachingLocationMapper;

@Service
public class TeachingLocationService {
	@Autowired
	private TeachingLocationMapper tlMapper;

	/**
	 * 获取所有的教学点名称
	 */
	public List<String> getAllTeachingLocationName() {
		return tlMapper.selectAllName();
	}

	/**
	 * 获取教学点名称对应的id
	 */
	public String getTlIdByName(String name) {
		return tlMapper.selectIdByName(name);
	}
}
