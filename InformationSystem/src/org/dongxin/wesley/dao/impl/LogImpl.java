package org.dongxin.wesley.dao.impl;

import java.util.List;

import org.dongxin.wesley.dao.LogDao;
import org.dongxin.wesley.entity.SystemLog;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LogImpl.java
 * ����		��2013-12-12
 * ��ϸע��	������ϵͳ��־��ɾ�Ĳ������ʵ����
 *
 */

public class LogImpl implements LogDao {

	@Override
	public List<SystemLog> getList() {
		return null;
	}

	@Override
	public boolean addLog(SystemLog log) {
		return false;
	}

	@Override
	public boolean update(SystemLog log) {
		return false;
	}

	@Override
	public boolean delete(SystemLog log) {
		return false;
	}

	@Override
	public List<SystemLog> getResearch(String keyWords) {
		return null;
	}

}
