package org.dongxin.wesley.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @see 字符串转换工具
 * 
 * @author 	：罗华强
 * email 	：1360042977@qq.com 
 * fileName : StringUtil.java 
 * 日期		：2013-12-11 详细注释 ：TODO
 * 
 */
public class StringUtil {
	
	/**
	 * 构造方法私有化
	 */
	private StringUtil() {
		
	}

	/**
	 * 将传入的对象转换为字符串
	 * @param obj	传入的对象
	 * @return	返回字符串
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
	 * 去掉字符串中的空格
	 * @param str	传入的字符串
	 * @return	返回不含空格的字符串
	 */
	public static String trim(String str) {
		return str.trim();
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str	传入的字符串
	 * @return	返回判断结果
	 */
	public static boolean isNull(String str) {
		if (str == null || str.length() == 0 || "".equals(str)) 
			return true;
		return false;
	}
	
	/**
	 * 将整型转化为字符串
	 * @param integer	传入的整型
	 * @return	返回字符串
	 */
	public static String integerToStr(Integer integer) {
		return String.valueOf(integer);
	}
	
	/**
	 * 将字符转换为字符串
	 * @param c		传入的字符
	 * @return	返回字符
	 */
	public static String charToStr(char c) {
		return String.valueOf(c);
	}
	
	/**
	 * 将双精度转换为字符串
	 * @param d	传入的双精度
	 * @return	返回字符
	 */
	public static String doubleToStr(double d) {
		return String.valueOf(d);
	}
	
	/**
	 * 将时间转换为字符串
	 * @param date	传入的时间
	 * @return	返回字符串
	 */
	public static String dateToStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		return time;
	}
	
	/**
	 * 将字符串转换为日期
	 * @param str	传入的字符串
	 * @return	返回日期
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
