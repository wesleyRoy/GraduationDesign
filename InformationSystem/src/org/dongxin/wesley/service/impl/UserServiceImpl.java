package org.dongxin.wesley.service.impl;

import java.util.List;

import org.dongxin.wesley.dao.UserDao;
import org.dongxin.wesley.entity.Manager;
import org.dongxin.wesley.service.UserService;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: UserServiceImpl.java
 * ����		��2013-12-12
 * ��ϸע��	���Թ���Ա��Ϣ������ɾ�Ĳ������ҵ������ʵ����
 *
 */

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<Manager> getList() {
		return userDao.getList();
	}

	@Override
	public boolean addmanager(Manager manager) {
		return userDao.addmanager(manager);
	}

	@Override
	public boolean update(Manager manager) {
		return userDao.update(manager);
	}

	@Override
	public boolean delete(Manager manager) {
		return userDao.delete(manager);
	}

	@Override
	public List<Manager> getResearch(String keyWords) {
		return userDao.getResearch(keyWords);
	}

	@Override
	public Manager getManagerByAccount(String account) {
		return null;
	}

}
