package org.dongxin.wesley.dao.impl;

import java.util.List;

import org.dongxin.wesley.dao.UserDao;
import org.dongxin.wesley.entity.Manager;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: UserImpl.java
 * ����		��2013-12-12
 * ��ϸע��	���Թ���Ա��Ϣ������ɾ�Ĳ�����ľ���ʵ����
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
