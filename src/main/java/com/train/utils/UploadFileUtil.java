package com.train.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileUtil {
	private static final String baseDir = "/home/hadoop/";

	// private static final String baseDir = "I:/TrainClass/";

	/**
	 * 上传文件
	 * 
	 * @param file
	 * @param dir
	 *            :表示要存储到那个目录下：格式为image/teachingmaterial/
	 *            newDir在合成之后为/home/hadoop/image/teachingmaterial/20160623/
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
			System.out.println("文件原名为" + filename);
			String timeDir = DataTimeUtil.getFormatedDate("yyyyMMdd") + "/";
			String newDir = baseDir + dir + timeDir;
			File dirFile = new File(newDir);
			if (!dirFile.exists()) {
				// 目录不存在
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
