package org.dongxin.wesley.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 	：LHQ
 * email 	：1360042977@qq.com
 * fileName	: Md5Encoder.java
 * 日期		：2013-12-13
 * 详细注释	：MD5的32位加密
 *
 */

public class Md5Encoder {

	/**
	 * @param str	传入的字符串
	 * @return	返回加密后的字符串
	 */
	public static String encoder(String str) {
		if (str == null || str.length() == 0 || "".equals(str)) {
			throw new IllegalArgumentException("str is not allowed to be null");
		}
		
		StringBuffer hexString = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] hash = md.digest();
			for (int i = 0; i < hash.length; i++) {
				if ((0xff & hash[i]) < 0x10) {
					hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
				} else {
					hexString.append(Integer.toHexString(0xFF & hash[i]));
				}
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return hexString.toString();
	}
}
