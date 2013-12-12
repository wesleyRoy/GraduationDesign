package org.dongxin.wesley.web.model;

import java.io.Serializable;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: User.java
 * ����		��2013-12-12
 * ��ϸע��	���û���¼��Ϣ
 *
 */

public class User implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 6224613591063321383L;
	private String account;		// �˺�
	private String password;	// ����
	private String code; // ��֤��

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
