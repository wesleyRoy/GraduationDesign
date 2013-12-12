package org.dongxin.wesley.dao;

import java.util.List;

import org.dongxin.wesley.entity.Manager;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: UserDao.java
 * ����		��2013-12-12
 * ��ϸע��	���Թ���Ա��Ϣ������ɾ�Ĳ�����Ľӿ�
 *
 */

public interface UserDao {

	/**
	 * ��ȡ���еĹ���Ա��Ϣ
	 * @return	���ع���Ա����
	 */
	public List<Manager> getList();
	
	/**
	 * ��ӹ���Ա��Ϣ
	 * @param manager	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean addmanager(Manager manager);
	
	/**
	 * �޸Ĺ���Ա��Ϣ
	 * @param manager	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean update(Manager manager);
	
	/**
	 * ɾ������Ա��Ϣ
	 * @param manager	��־��Ϣ����
	 * @return	����true����false
	 */
	public boolean delete(Manager manager);
	
	/**
	 * ���ݹؼ�������������Ա��Ϣ
	 * @param keyWords	�����Ĺؼ���
	 * @return	���ع���Ա��Ϣ����
	 */
	public List<Manager> getResearch(String keyWords);
	
	/**
	 * ���ݹ���Ա�˺Ż�ȡ����Ա��Ϣ
	 * @param account	����Ա�˺�
	 * @return	���ع���Ա����
	 */
	public Manager getManagerByAccount(String account);
}
