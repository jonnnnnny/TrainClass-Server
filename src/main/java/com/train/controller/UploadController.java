package com.train.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.train.utils.UploadFileUtil;

@Controller
@RequestMapping("/upload/")
public class UploadController {
	@RequestMapping("uploadImage.do")
	@ResponseBody
	public Object uploadImage(
			@RequestParam(value = "upfile") MultipartFile file,
			HttpServletResponse response) throws Exception {
		String uploadDir = UploadFileUtil.uploadFile(file, "image/test/");
		if (uploadDir == null) {
			return "上传失败";
		}

		return uploadDir;
	}

	/**
	 * 需要路径参数dir
	 * 
	 * @param fileDir
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("downloadFile.do")
	public void downloadFile(@RequestParam(value = "dir") String fileDir,
			HttpServletResponse response) throws IOException {
		File file = new File(fileDir);
		if (!file.exists()) {
			return;
		}
		FileInputStream fis = new FileInputStream(file);
		ServletOutputStream sos = response.getOutputStream();
		byte[] b = new byte[1024 * 4];
		int len = 0;
		while ((len = fis.read(b)) > 0) {
			sos.write(b, 0, len);
		}
		sos.flush();
	}
}
