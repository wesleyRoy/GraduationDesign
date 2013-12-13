package org.dongxin.wesley.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 	：LHQ
 * email 	：1360042977@qq.com
 * fileName	: Hibernate.java
 * 日期		：2013-12-13
 * 详细注释	：创建Session
 *
 */

@Transactional
public class Hibernate {

	private static SessionFactory sessionFactory;
	private static Session session;
	private static ThreadLocal<Session> thread = new ThreadLocal<Session>();
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		Hibernate.sessionFactory = sessionFactory;
	}

	/**
	 * 获取Session
	 * @return	返回Session
	 */
	public static Session getSession() {
		session = thread.get();
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}
	
	/**
	 * 关闭Session
	 */
	public static void closeSession() {
		if (session != null) {
			session.close();
		}
	}
	
	/**
	 * 销毁SessionFactory
	 */
	public static void destroy() {
		if (session != null) {
			session.close();
		}
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
