package com.train.controller.sql;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.train.service.ExecuteSQLService;

@Controller
@RequestMapping("/sql")
public class APPSQLController {
	@Resource
	private ExecuteSQLService executeSQLService;

	@RequestMapping("/select.do")
	@ResponseBody
	public List<HashMap> selectBySQL(@RequestParam HashMap map) {
		return executeSQLService.selectBySQL(map);
	}
}
