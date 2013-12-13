package org.dongxin.wesley.test;

import org.dongxin.wesley.util.SystemUtil;
import org.junit.Test;

/**
 * @author 	��LHQ 
 * email 	��1360042977@qq.com 
 * fileName : SystemUtilTest.java 
 * ����		��2013-12-12 ��ϸע�� ��ϵͳ���߲�����
 * 
 */

public class SystemUtilTest {

	/**
	 * ������֤����
	 */
	@Test
	public void testEmail() {
		String email = "B1360042977@163.com";
		if (SystemUtil.validateEmail(email)) {
			System.out.println("������Ϸ�");
		} else {
			System.out.println("�����䲻�Ϸ�");
		}
	}

	/**
	 * ������֤�绰����
	 */
	@Test
	public void testPhone() {
		String tel = "13881928865";
		if (SystemUtil.validatePhone(tel)) {
			System.out.println("�õ绰������Ч");
		} else {
			System.out.println("�ĵ绰������Ч");
		}
	}

	/**
	 * ������֤IP��ַ
	 */
	@Test
	public void testIp() {
		String ip = "192.168.0.1";
		if (SystemUtil.validateIp(ip)) {
			System.out.println("��IP��ַ��Ч");
		} else {
			System.out.println("��IP��ַ��Ч");
		}
	}

	/**
	 * ������֤��������
	 */
	@Test
	public void testInput() {
		String input = "1";
		if (SystemUtil.validateInput(input)) {
			System.out.println("��Ч����");
		} else {
			System.out.println("������Ч����");
		}
	}

}
