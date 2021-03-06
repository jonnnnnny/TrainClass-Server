package com.train.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeUtil {
	/**
	 * 获取格式化好的日期时间格式
	 * 
	 * G 年代标志符 
	 * y 年 
	 * M 月 
	 * d 日 
	 * h 时 在上午或下午 (1~12) 
	 * H 时 在一天中 (0~23) 
	 * m 分 
	 * s 秒 
	 * S 毫秒 
	 * E 星期 
	 * D 一年中的第几天 
	 * F 一月中第几个星期几 
	 * w 一年中第几个星期 
	 * W 一月中第几个星期 
	 * a 上午 / 下午 标记符 
	 * k 时 在一天中 (1~24) 
	 * K 时 在上午或下午 (0~11) 
	 * z 时区
	 * 
	 * @param formatString
	 *            :如“yyyyMMdd” 产生 20160613
	 * @return
	 */
	public static String getFormatedDate(String formatString) {
		SimpleDateFormat format = new SimpleDateFormat(formatString);
		return format.format(new Date());
	}
}
