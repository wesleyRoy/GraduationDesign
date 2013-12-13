package org.dongxin.wesley.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: SystemUtil.java
 * ����		��2013-12-12
 * ��ϸע��	��ϵͳ������
 *
 */

public class SystemUtil {
	
	private static final Logger logger = Logger.getLogger(SystemUtil.class);
	/**
	 * ���췽��˽�л�
	 */
	public SystemUtil() {
		
	}

	/**
	 * �ж��û�����������Ƿ�Ϸ�
	 * @param email	����
	 * @return	����true����false
	 */
	public static boolean validateEmail(String email) {
		boolean flag = false;
		try {
			String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			flag = matcher.matches();
			logger.info(email + "�ǺϷ����䣡");
		} catch (Exception e) {
			logger.error(email + "���ǺϷ����䣡");
			e.printStackTrace();
			flag = false;
		}
		return flag;
 	}
	
	/**
	 * �ж��û������IP��ַ�Ƿ�Ϸ�
	 * @param ip	IP��ַ
	 * @return	����true����false
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
			logger.info(ip + "����ЧIP��ַ��");
		} catch (Exception e) {
			logger.equals(ip + "������ЧIP��ַ��");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	
	/**
	 * �ж��û�����ĵ绰�����Ƿ�Ϸ�
	 * @param tel	�绰����
	 * @return	����true����false
	 */
	public static boolean validatePhone(String tel) {
		boolean flag = false;
		try {
			String regex = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(tel);
			flag = matcher.matches();
			logger.info(tel + "����Ч�绰���룡");
		} catch (Exception e) {
			logger.equals(tel + "������Ч�绰���룡");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	/**
	 * �ж������ֵ�Ƿ�Ϊ����
	 * @param input	����ֵ
	 * @return	����true����false
	 */
	public static boolean validateInput(String input) {
		boolean flag = false;
		try {
			String regex = "[0-9]+";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(input);
			flag = matcher.matches();
			logger.info(input + "����Ч���ͣ�");
		} catch (Exception e) {
			logger.equals(input + "������Ч���ͣ�");
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
}
