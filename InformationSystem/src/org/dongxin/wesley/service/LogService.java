package org.dongxin.wesley.service;

import java.util.List;

import org.dongxin.wesley.entity.SystemLog;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: LogService.java
 * 日期		：2013-12-12
 * 详细注释	：对系统日志进行增删改查的业务层接口
 *
 */

public interface LogService {

	/**
	 * 获取所有的系统日志信息
	 * @return	返回系统日志集合
	 */
	public List<SystemLog> getList();
	
	/**
	 * 添加系统日志信息
	 * @param log	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean addLog(SystemLog log);
	
	/**
	 * 修改系统日志信息
	 * @param log	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean update(SystemLog log);
	
	/**
	 * 删除系统日志信息
	 * @param log	日志信息对象
	 * @return	返回true或者false
	 */
	public boolean delete(SystemLog log);
	
	/**
	 * 根据关键字来搜索系统日志信息
	 * @param keyWords	搜索的关键字
	 * @return	返回系统日志信息集合
	 */
	public List<SystemLog> getResearch(String keyWords);
}
