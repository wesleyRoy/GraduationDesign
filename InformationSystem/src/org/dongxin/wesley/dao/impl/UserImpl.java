package org.dongxin.wesley.dao.impl;

import java.util.List;

import org.dongxin.wesley.dao.UserDao;
import org.dongxin.wesley.entity.Manager;
import org.dongxin.wesley.query.ManagerQuery;
import org.dongxin.wesley.util.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: UserImpl.java
 * 日期		：2013-12-12
 * 详细注释	：对管理员信息进行增删改查操作的具体实现类
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Manager> getByCondition(Manager manager) {
		String hql = "from Manager where 1=1"+ManagerQuery.generateQuery(manager) + " order by id";
		List<Manager> list = null;
		Session session = Hibernate.getSession();
		Transaction tx = session.beginTransaction();
		try {
			Query query = session.createQuery(hql);
			ManagerQuery.prepareQuery(manager, query);
			list = query.list();
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			Hibernate.closeSession();
		}
		return list;
	}

}
