package org.dongxin.wesley.web.model;

import java.io.Serializable;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: User.java
 * 日期		：2013-12-12
 * 详细注释	：用户登录信息
 *
 */

public class User implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 6224613591063321383L;
	private String account;		// 账号
	private String password;	// 密码
	private String code; // 验证码

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
