package org.dongxin.wesley.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: PermissionFilter.java
 * ����		��2013-12-12
 * ��ϸע��	��Ȩ�޼��
 *
 */

public class PermissionFilter extends AbstractInterceptor {

	private static final long serialVersionUID = 3123844455273837883L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("/***********Ȩ�޼��************/");
		return invocation.invoke();
	}

}
