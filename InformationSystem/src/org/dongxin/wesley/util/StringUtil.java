package org.dongxin.wesley.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @see �ַ���ת������
 * 
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com 
 * fileName : StringUtil.java 
 * ����		��2013-12-11 ��ϸע�� ��TODO
 * 
 */
public class StringUtil {
	
	/**
	 * ���췽��˽�л�
	 */
	private StringUtil() {
		
	}

	/**
	 * ������Ķ���ת��Ϊ�ַ���
	 * @param obj	����Ķ���
	 * @return	�����ַ���
	 */
	public static String toString(Object obj) {
		if (obj instanceof String) {
			String str = (String) obj;
			return str;
		} else {
			return obj.toString();
		}
	}
	
	/**
	 * ȥ���ַ����еĿո�
	 * @param str	������ַ���
	 * @return	���ز����ո���ַ���
	 */
	public static String trim(String str) {
		return str.trim();
	}
	
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param str	������ַ���
	 * @return	�����жϽ��
	 */
	public static boolean isNull(String str) {
		if (str == null || str.length() == 0 || "".equals(str)) 
			return true;
		return false;
	}
	
	/**
	 * ������ת��Ϊ�ַ���
	 * @param integer	���������
	 * @return	�����ַ���
	 */
	public static String integerToStr(Integer integer) {
		return String.valueOf(integer);
	}
	
	/**
	 * ���ַ�ת��Ϊ�ַ���
	 * @param c		������ַ�
	 * @return	�����ַ�
	 */
	public static String charToStr(char c) {
		return String.valueOf(c);
	}
	
	/**
	 * ��˫����ת��Ϊ�ַ���
	 * @param d	�����˫����
	 * @return	�����ַ�
	 */
	public static String doubleToStr(double d) {
		return String.valueOf(d);
	}
	
	/**
	 * ��ʱ��ת��Ϊ�ַ���
	 * @param date	�����ʱ��
	 * @return	�����ַ���
	 */
	public static String dateToStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		return time;
	}
	
	/**
	 * ���ַ���ת��Ϊ����
	 * @param str	������ַ���
	 * @return	��������
	 */
	public static Date strToDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
