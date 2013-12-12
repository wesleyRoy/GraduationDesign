package org.dongxin.wesley.dao.impl;

import java.util.List;

import org.dongxin.wesley.dao.LogDao;
import org.dongxin.wesley.entity.SystemLog;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: LogImpl.java
 * 日期		：2013-12-12
 * 详细注释	：进行系统日志增删改查操作的实现类
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
