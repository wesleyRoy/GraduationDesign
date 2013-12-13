package org.dongxin.wesley.test;

import org.dongxin.wesley.util.SystemUtil;
import org.junit.Test;

/**
 * @author 	：LHQ 
 * email 	：1360042977@qq.com 
 * fileName : SystemUtilTest.java 
 * 日期		：2013-12-12 详细注释 ：系统工具测试类
 * 
 */

public class SystemUtilTest {

	/**
	 * 测试验证邮箱
	 */
	@Test
	public void testEmail() {
		String email = "B1360042977@163.com";
		if (SystemUtil.validateEmail(email)) {
			System.out.println("该邮箱合法");
		} else {
			System.out.println("该邮箱不合法");
		}
	}

	/**
	 * 测试验证电话号码
	 */
	@Test
	public void testPhone() {
		String tel = "13881928865";
		if (SystemUtil.validatePhone(tel)) {
			System.out.println("该电话号码有效");
		} else {
			System.out.println("改电话号码无效");
		}
	}

	/**
	 * 测试验证IP地址
	 */
	@Test
	public void testIp() {
		String ip = "192.168.0.1";
		if (SystemUtil.validateIp(ip)) {
			System.out.println("该IP地址有效");
		} else {
			System.out.println("该IP地址无效");
		}
	}

	/**
	 * 测试验证输入类型
	 */
	@Test
	public void testInput() {
		String input = "1";
		if (SystemUtil.validateInput(input)) {
			System.out.println("有效类型");
		} else {
			System.out.println("不是有效类型");
		}
	}

}
