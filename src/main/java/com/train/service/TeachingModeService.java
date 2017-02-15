package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.TeachingModeMapper;

@Service
public class TeachingModeService {
	@Autowired
	private TeachingModeMapper tmMapper;

	public List<String> getAllTmName() {
		return tmMapper.selectAllName();
	}

	public String getTmIdByBfName(String name) {
		return tmMapper.selectIdByBfName(name);
	}
}
