package org.dongxin.wesley.service;

import java.util.List;

import org.dongxin.wesley.entity.Manager;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: UserService.java
 * 日期		：2013-12-12
 * 详细注释	：对管理员信息进行增删改查操作的业务层接口
 *
 */

public interface UserService {

	/**
	 * 获取所有的管理员信息
	 * @return	返回管理员集合
	 */
	public List<Manager> getList();
	
	/**
	 * 添加管理员信息
	 * @param manager	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean addmanager(Manager manager);
	
	/**
	 * 修改管理员信息
	 * @param manager	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean update(Manager manager);
	
	/**
	 * 删除管理员信息
	 * @param manager	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean delete(Manager manager);
	
	/**
	 * 根据关键字来搜索管理员信息
	 * @param keyWords	搜索的关键字
	 * @return	返回管理员信息集合
	 */
	public List<Manager> getResearch(String keyWords);
	
	/**
	 * 根据管理员账号获取管理员信息
	 * @param account	管理员账号
	 * @return	返回管理员对象
	 */
	public Manager getManagerByAccount(String account);
	
}
