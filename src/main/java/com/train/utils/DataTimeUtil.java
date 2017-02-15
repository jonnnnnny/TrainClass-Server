package com.train.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeUtil {
	/**
	 * ��ȡ��ʽ���õ�����ʱ���ʽ
	 * 
	 * G �����־�� 
	 * y �� 
	 * M �� 
	 * d �� 
	 * h ʱ ����������� (1~12) 
	 * H ʱ ��һ���� (0~23) 
	 * m �� 
	 * s �� 
	 * S ���� 
	 * E ���� 
	 * D һ���еĵڼ��� 
	 * F һ���еڼ������ڼ� 
	 * w һ���еڼ������� 
	 * W һ���еڼ������� 
	 * a ���� / ���� ��Ƿ� 
	 * k ʱ ��һ���� (1~24) 
	 * K ʱ ����������� (0~11) 
	 * z ʱ��
	 * 
	 * @param formatString
	 *            :�硰yyyyMMdd�� ���� 20160613
	 * @return
	 */
	public static String getFormatedDate(String formatString) {
		SimpleDateFormat format = new SimpleDateFormat(formatString);
		return format.format(new Date());
	}
}
