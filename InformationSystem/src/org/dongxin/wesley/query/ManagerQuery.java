package org.dongxin.wesley.query;

import org.dongxin.wesley.entity.Manager;
import org.hibernate.Query;

/**
 * @author 	：LHQ
 * email 	：1360042977@qq.com
 * fileName	: ManagerQuery.java
 * 日期		：2013-12-13
 * 详细注释	：根据查询条件找到管理员信息
 *
 */
public class ManagerQuery {

	/**
	 * 根据条件查询出管理员信息
	 * @param manager	管理员对象
	 * @return	返回字符串
	 */
	public static String generateQuery(Manager manager) {
		StringBuffer buffer = new StringBuffer();
		// 用户是否使用账号作为查询条件
		if (manager.getAccount() != null || manager.getAccount().trim().length() != 0) {
			buffer.append(" and account like ?");
		}
		
		// 用户是否使用用户名作为查询条件
		if (manager.getUsername() != null || manager.getUsername().trim().length() != 0) {
			buffer.append(" and username like ?");
		}
		
		// 用户是否使用性别作为查询条件
		if (manager.getGender() != null || manager.getGender().trim().length() != 0) {
			buffer.append(" and gender=?");
		}
		
		// 用户是否使用出生日期作为查询条件
		if (manager.getBirthday() != null) {
			buffer.append(" and birthday like ?");
		}
		
		// 用户是否使用年龄最小值作为查询条件
		if (manager.getAge() > 0) {
			buffer.append(" and age>=?");
		}
		
		// 用户是否使用年龄最大值作为查询条件
		if (manager.getAge() > 0) {
			buffer.append(" and age<=?");
		}
		
		// 用户是否使用权限作为查询条件
		if (manager.getRole() != null || manager.getRole().trim().length() != 0) {
			buffer.append(" and role=?");
		}
		
		return buffer.toString();
	}
	
	/**
	 * 设置查询语句
	 * @param manager	管理员对象
	 * @param query	查询语句
	 * @throws Exception	抛出异常
	 */
	public static void prepareQuery(Manager manager, Query query) throws Exception {
		int count = 0;
		// 用户是否使用账号作为查询条件
		if (manager.getAccount() != null || manager.getAccount().trim().length() != 0) {
			query.setString(count++, manager.getAccount());
		}

		// 用户是否使用用户名作为查询条件
		if (manager.getUsername() != null || manager.getUsername().trim().length() != 0) {
			query.setString(count++, manager.getUsername());
		}

		// 用户是否使用性别作为查询条件
		if (manager.getGender() != null || manager.getGender().trim().length() != 0) {
			query.setString(count++, manager.getGender());
		}

		// 用户是否使用出生日期作为查询条件
		if (manager.getBirthday() != null) {
			query.setDate(count++, manager.getBirthday());
		}

		// 用户是否使用年龄最小值作为查询条件
		if (manager.getAge() > 0) {
			query.setInteger(count++, manager.getAge());
		}

		// 用户是否使用年龄最大值作为查询条件
		if (manager.getAge() > 0) {
			query.setInteger(count++, manager.getAge());
		}

		// 用户是否使用权限作为查询条件
		if (manager.getRole() != null || manager.getRole().trim().length() != 0) {
			query.setString(count++, manager.getRole());
		}
	}
}
