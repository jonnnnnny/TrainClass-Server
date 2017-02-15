package com.train.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.train.mapper.ExecuteSQL;

@Service
public class ExecuteSQLService {
	@Resource
	private ExecuteSQL executeSQL;

	public List<HashMap> selectBySQL(HashMap map) {
		return executeSQL.executeSQL(map);
	}
}
