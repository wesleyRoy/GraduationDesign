package org.dongxin.wesley.web.action;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.dongxin.wesley.entity.Manager;
import org.dongxin.wesley.service.LogService;
import org.dongxin.wesley.service.UserService;
import org.dongxin.wesley.util.StringUtil;
import org.dongxin.wesley.web.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: LoginAction.java
 * ����		��2013-12-12
 * ��ϸע��	���û���¼ϵͳ���˳�ϵͳ�Ĳ���
 *
 */

@Component("loginAction")
@Namespace("")
@Scope("prototype")
public class LoginAction extends ActionSupport {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = -7736575789778349233L;
	protected final Logger logger = Logger.getLogger(LoginAction.class);	// ��־��¼
	private User user; 	// �û���Ϣ����
	private String captcha;	// ��֤��
	private UserService userService;	
	private LogService logService;
	private Manager manager;
	private Map<String, Object> session = null;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public LogService getLogService() {
		return logService;
	}

	public void setLogService(LogService logService) {
		this.logService = logService;
	}


	// ��ȡ��¼�û�������˺ź�����
	String account = StringUtil.trim(user.getAccount());
	String password = StringUtil.trim(user.getPassword());
	// ��ȡ��ǰʱ��
	String time = StringUtil.dateToStr(new Date());

	/**
	 * ��֤��¼�û��Ƿ�Ϸ�
	 * @return	
	 */
	@Actions({ @Action(value = "login", results = {
			@Result(name = "success", location = "/main.jsp"),
			@Result(name = "error", location = "/error.jsp"),
			@Result(name = "input", location = "/login.jsp"),
			@Result(name = "login", location = "/login.jsp") }) })
	public String login() throws Exception {
		session = ActionContext.getContext().getSession();
		// �ж���֤���Ƿ���ȷ
		if (user.getCode().equals(captcha)) {
			if (account.equals("wesley") && password.equals("123")) {
				logger.info("�û���"+ account + "��¼ϵͳ��---"+ time);
				manager = userService.getManagerByAccount(account);
				session.put("username", manager.getUsername());	// ���û������浽Session�Ự��
				session.put("role", manager.getRole());	// ������Ա��Ȩ�޷���Session�Ự��
				return SUCCESS;
			} else {
				logger.warn("��¼ϵͳ��������û�������---"+ time);
				return LOGIN;
			}
		} else {
			logger.error("��֤�벻��ȷ��---"+ time);
			return ERROR;
		}
	}
	
	/**
	 * �˳�ϵͳ
	 * @return
	 */
	@Actions({ @Action(value = "logout", results = {
			@Result(name = "success", location = "/login.jsp"),
			@Result(name = "error", location = "/error.jsp") }) })
	public String logout() throws Exception {
		logger.info(account + "�˳�ϵͳ---"+ time);
		session.remove("username");	// ���û�����Session�Ự��ɾ��
		session.remove("role");		// ��Ȩ�޴�Session�Ự��ɾ��
		return SUCCESS;
	}
}
