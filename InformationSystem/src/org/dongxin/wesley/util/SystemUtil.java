package org.dongxin.wesley.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: SystemUtil.java
 * 日期		：2013-12-12
 * 详细注释	：系统工具类
 *
 */

public class SystemUtil {
	
	private static final Logger logger = Logger.getLogger(SystemUtil.class);
	/**
	 * 构造方法私有化
	 */
	public SystemUtil() {
		
	}

	/**
	 * 判断用户输入的邮箱是否合法
	 * @param email	邮箱
	 * @return	返回true或者false
	 */
	public static boolean validateEmail(String email) {
		boolean flag = false;
		try {
			String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			flag = matcher.matches();
			logger.info(email + "是合法邮箱！");
		} catch (Exception e) {
			logger.error(email + "不是合法邮箱！");
			e.printStackTrace();
			flag = false;
		}
		return flag;
 	}
	
	/**
	 * 判断用户输入的IP地址是否合法
	 * @param ip	IP地址
	 * @return	返回true或者false
	 */
	public static boolean validateIp(String ip) {
		boolean flag = false;
		try {
			String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(ip);
			flag = matcher.matches();
			logger.info(ip + "是有效IP地址！");
		} catch (Exception e) {
			logger.equals(ip + "不是有效IP地址！");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	
	/**
	 * 判断用户输入的电话号码是否合法
	 * @param tel	电话号码
	 * @return	返回true或者false
	 */
	public static boolean validatePhone(String tel) {
		boolean flag = false;
		try {
			String regex = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(tel);
			flag = matcher.matches();
			logger.info(tel + "是有效电话号码！");
		} catch (Exception e) {
			logger.equals(tel + "不是有效电话号码！");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	/**
	 * 判断输入的值是否为整型
	 * @param input	输入值
	 * @return	返回true或者false
	 */
	public static boolean validateInput(String input) {
		boolean flag = false;
		try {
			String regex = "[0-9]+";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			flag = matcher.matches();
			logger.info(input + "是有效类型！");
		} catch (Exception e) {
			logger.equals(input + "不是有效类型！");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
}
