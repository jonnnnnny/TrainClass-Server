package com.train.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileUtil {
	private static final String baseDir = "/home/hadoop/";

	// private static final String baseDir = "I:/TrainClass/";

	/**
	 * �ϴ��ļ�
	 * 
	 * @param file
	 * @param dir
	 *            :��ʾҪ�洢���Ǹ�Ŀ¼�£���ʽΪimage/teachingmaterial/
	 *            newDir�ںϳ�֮��Ϊ/home/hadoop/image/teachingmaterial/20160623/
	 * @return
	 */
	public static String uploadFile(MultipartFile file, String dir)
			throws Exception {
		if (file == null) {
			return null;
		} else if (file.getSize() == 0) {
			return null;
		} else {
			String filename = file.getOriginalFilename();
			System.out.println("�ļ�ԭ��Ϊ" + filename);
			String timeDir = DataTimeUtil.getFormatedDate("yyyyMMdd") + "/";
			String newDir = baseDir + dir + timeDir;
			File dirFile = new File(newDir);
			if (!dirFile.exists()) {
				// Ŀ¼������
				dirFile.mkdirs();
			}
			File newFile = new File(dirFile, filename);
			if (newFile.exists()) {
				newFile.delete();
			}
			file.transferTo(newFile);
			return newFile.getAbsolutePath();
		}
	}
}
