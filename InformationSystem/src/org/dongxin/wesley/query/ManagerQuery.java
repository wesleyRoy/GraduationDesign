package org.dongxin.wesley.query;

import org.dongxin.wesley.entity.Manager;
import org.hibernate.Query;

/**
 * @author 	��LHQ
 * email 	��1360042977@qq.com
 * fileName	: ManagerQuery.java
 * ����		��2013-12-13
 * ��ϸע��	�����ݲ�ѯ�����ҵ�����Ա��Ϣ
 *
 */
public class ManagerQuery {

	/**
	 * ����������ѯ������Ա��Ϣ
	 * @param manager	����Ա����
	 * @return	�����ַ���
	 */
	public static String generateQuery(Manager manager) {
		StringBuffer buffer = new StringBuffer();
		// �û��Ƿ�ʹ���˺���Ϊ��ѯ����
		if (manager.getAccount() != null || manager.getAccount().trim().length() != 0) {
			buffer.append(" and account like ?");
		}
		
		// �û��Ƿ�ʹ���û�����Ϊ��ѯ����
		if (manager.getUsername() != null || manager.getUsername().trim().length() != 0) {
			buffer.append(" and username like ?");
		}
		
		// �û��Ƿ�ʹ���Ա���Ϊ��ѯ����
		if (manager.getGender() != null || manager.getGender().trim().length() != 0) {
			buffer.append(" and gender=?");
		}
		
		// �û��Ƿ�ʹ�ó���������Ϊ��ѯ����
		if (manager.getBirthday() != null) {
			buffer.append(" and birthday like ?");
		}
		
		// �û��Ƿ�ʹ��������Сֵ��Ϊ��ѯ����
		if (manager.getAge() > 0) {
			buffer.append(" and age>=?");
		}
		
		// �û��Ƿ�ʹ���������ֵ��Ϊ��ѯ����
		if (manager.getAge() > 0) {
			buffer.append(" and age<=?");
		}
		
		// �û��Ƿ�ʹ��Ȩ����Ϊ��ѯ����
		if (manager.getRole() != null || manager.getRole().trim().length() != 0) {
			buffer.append(" and role=?");
		}
		
		return buffer.toString();
	}
	
	/**
	 * ���ò�ѯ���
	 * @param manager	����Ա����
	 * @param query	��ѯ���
	 * @throws Exception	�׳��쳣
	 */
	public static void prepareQuery(Manager manager, Query query) throws Exception {
		int count = 0;
		// �û��Ƿ�ʹ���˺���Ϊ��ѯ����
		if (manager.getAccount() != null || manager.getAccount().trim().length() != 0) {
			query.setString(count++, manager.getAccount());
		}

		// �û��Ƿ�ʹ���û�����Ϊ��ѯ����
		if (manager.getUsername() != null || manager.getUsername().trim().length() != 0) {
			query.setString(count++, manager.getUsername());
		}

		// �û��Ƿ�ʹ���Ա���Ϊ��ѯ����
		if (manager.getGender() != null || manager.getGender().trim().length() != 0) {
			query.setString(count++, manager.getGender());
		}

		// �û��Ƿ�ʹ�ó���������Ϊ��ѯ����
		if (manager.getBirthday() != null) {
			query.setDate(count++, manager.getBirthday());
		}

		// �û��Ƿ�ʹ��������Сֵ��Ϊ��ѯ����
		if (manager.getAge() > 0) {
			query.setInteger(count++, manager.getAge());
		}

		// �û��Ƿ�ʹ���������ֵ��Ϊ��ѯ����
		if (manager.getAge() > 0) {
			query.setInteger(count++, manager.getAge());
		}

		// �û��Ƿ�ʹ��Ȩ����Ϊ��ѯ����
		if (manager.getRole() != null || manager.getRole().trim().length() != 0) {
			query.setString(count++, manager.getRole());
		}
	}
}
