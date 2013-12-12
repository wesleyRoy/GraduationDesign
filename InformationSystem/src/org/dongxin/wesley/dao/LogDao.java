package org.dongxin.wesley.dao;

import java.util.List;

import org.dongxin.wesley.entity.SystemLog;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LogDao.java
 * ����		��2013-12-12
 * ��ϸע��	��ʵ��ϵͳ��־����ɾ�Ĳ����
 *
 */

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LogDao.java
 * ����		��2013-12-12
 * ��ϸע��	����ϵͳ��־������ɾ�Ĳ�Ľӿ�
 *
 */

public interface LogDao {

	/**
	 * ��ȡ���е�ϵͳ��־��Ϣ
	 * @return	����ϵͳ��־����
	 */
	public List<SystemLog> getList();
	
	/**
	 * ���ϵͳ��־��Ϣ
	 * @param log	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean addLog(SystemLog log);
	
	/**
	 * �޸�ϵͳ��־��Ϣ
	 * @param log	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean update(SystemLog log);
	
	/**
	 * ɾ��ϵͳ��־��Ϣ
	 * @param log	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean delete(SystemLog log);
	
	/**
	 * ���ݹؼ���������ϵͳ��־��Ϣ
	 * @param keyWords	�����Ĺؼ���
	 * @return	����ϵͳ��־��Ϣ����
	 */
	public List<SystemLog> getResearch(String keyWords);
}
