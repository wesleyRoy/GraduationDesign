package org.dongxin.wesley.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: PermissionFilter.java
 * 日期		：2013-12-12
 * 详细注释	：权限检查
 *
 */

public class PermissionFilter extends AbstractInterceptor {

	private static final long serialVersionUID = 3123844455273837883L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("/***********权限检查************/");
		return invocation.invoke();
	}

}
