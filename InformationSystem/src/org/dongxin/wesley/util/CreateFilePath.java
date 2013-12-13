package org.dongxin.wesley.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

/**
 * @author 	��LHQ
 * email 	��1360042977@qq.com
 * fileName	: CreateFilePath.java
 * ����		��2013-12-13
 * ��ϸע��	�������ļ�·��
 *
 */

public class CreateFilePath {

	private static final String SAVE_DIR = "/upload";
	private static final String DOWNLOAD_DIR = "/upload/";
	
	/**
	 * �����ϴ��ļ�
	 * @param file	�ϴ��ļ�
	 * @param fileName	�ϴ��ļ���
	 * @throws Exception	�׳��쳣
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
	 * �����ļ�
	 * @param fileName	�����ļ���
	 * @throws Exception	�׳��쳣
	 * @return	���������ļ����ļ���Ϣ
	 */
	public static InputStream downloadFile(String fileName) throws Exception {
		String download_Name = new String(fileName.getBytes(),"GBK");
		return ServletActionContext.getServletContext().getResourceAsStream(DOWNLOAD_DIR+download_Name);
	}
}
