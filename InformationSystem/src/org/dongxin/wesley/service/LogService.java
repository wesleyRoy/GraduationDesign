package org.dongxin.wesley.service;

import java.util.List;

import org.dongxin.wesley.entity.SystemLog;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LogService.java
 * ����		��2013-12-12
 * ��ϸע��	����ϵͳ��־������ɾ�Ĳ��ҵ���ӿ�
 *
 */

public interface LogService {

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
