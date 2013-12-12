package org.dongxin.wesley.dao.impl;

import java.util.List;

import org.dongxin.wesley.dao.UserDao;
import org.dongxin.wesley.entity.Manager;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: UserImpl.java
 * 日期		：2013-12-12
 * 详细注释	：对管理员信息进行增删改查操作的具体实现类
 *
 */

public class UserImpl implements UserDao {

	@Override
	public List<Manager> getList() {
		return null;
	}

	@Override
	public boolean addmanager(Manager manager) {
		return false;
	}

	@Override
	public boolean update(Manager manager) {
		return false;
	}

	@Override
	public boolean delete(Manager manager) {
		return false;
	}

	@Override
	public List<Manager> getResearch(String keyWords) {
		return null;
	}

	@Override
	public Manager getManagerByAccount(String account) {
		return null;
	}

}
