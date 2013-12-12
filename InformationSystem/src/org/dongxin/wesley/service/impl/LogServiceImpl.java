package org.dongxin.wesley.service.impl;

import java.util.List;

import org.dongxin.wesley.dao.LogDao;
import org.dongxin.wesley.entity.SystemLog;
import org.dongxin.wesley.service.LogService;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LogServiceImpl.java
 * ����		��2013-12-12
 * ��ϸע��	��ʵ��ϵͳ��־��ɾ�Ĳ������ҵ���ʵ����
 *
 */

public class LogServiceImpl implements LogService {

	private LogDao logDao;
	
	public LogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	@Override
	public List<SystemLog> getList() {
		return logDao.getList();
	}

	@Override
	public boolean addLog(SystemLog log) {
		return logDao.addLog(log);
	}

	@Override
	public boolean update(SystemLog log) {
		return logDao.update(log);
	}

	@Override
	public boolean delete(SystemLog log) {
		return logDao.delete(log);
	}

	@Override
	public List<SystemLog> getResearch(String keyWords) {
		return logDao.getResearch(keyWords);
	}

}
