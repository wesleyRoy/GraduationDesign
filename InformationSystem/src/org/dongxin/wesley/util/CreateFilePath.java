package org.dongxin.wesley.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

/**
 * @author 	：LHQ
 * email 	：1360042977@qq.com
 * fileName	: CreateFilePath.java
 * 日期		：2013-12-13
 * 详细注释	：创建文件路径
 *
 */

public class CreateFilePath {

	private static final String SAVE_DIR = "/upload";
	private static final String DOWNLOAD_DIR = "/upload/";
	
	/**
	 * 保存上传文件
	 * @param file	上传文件
	 * @param fileName	上传文件名
	 * @throws Exception	抛出异常
	 */
	@SuppressWarnings("deprecation")
	public static void uploadFile(File file, String fileName) throws Exception {
		String path = ServletActionContext.getRequest().getRealPath(SAVE_DIR);
		InputStream is = new FileInputStream(file);
		File saveFile = new File(path, fileName);
		if (!saveFile.exists()) {
			saveFile.mkdir();
		}
		OutputStream os = new FileOutputStream(saveFile);
		byte[] buffer = new byte[is.available()];
		int len = 0;
		while ((len = is.read(buffer)) > 0) {
			os.write(buffer, 0, len);
		}
		is.close();
		os.close();
	}
	
	/**
	 * 下载文件
	 * @param fileName	下载文件名
	 * @throws Exception	抛出异常
	 * @return	返回下载文件的文件信息
	 */
	public static InputStream downloadFile(String fileName) throws Exception {
		String download_Name = new String(fileName.getBytes(),"GBK");
		return ServletActionContext.getServletContext().getResourceAsStream(DOWNLOAD_DIR+download_Name);
	}
}
