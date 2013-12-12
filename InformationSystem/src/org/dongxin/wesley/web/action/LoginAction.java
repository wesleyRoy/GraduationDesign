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
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: LoginAction.java
 * 日期		：2013-12-12
 * 详细注释	：用户登录系统和退出系统的操作
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
	protected final Logger logger = Logger.getLogger(LoginAction.class);	// 日志记录
	private User user; 	// 用户信息对象
	private String captcha;	// 验证码
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


	// 获取登录用户输入的账号和密码
	String account = StringUtil.trim(user.getAccount());
	String password = StringUtil.trim(user.getPassword());
	// 获取当前时间
	String time = StringUtil.dateToStr(new Date());

	/**
	 * 验证登录用户是否合法
	 * @return	
	 */
	@Actions({ @Action(value = "login", results = {
			@Result(name = "success", location = "/main.jsp"),
			@Result(name = "error", location = "/error.jsp"),
			@Result(name = "input", location = "/login.jsp"),
			@Result(name = "login", location = "/login.jsp") }) })
	public String login() throws Exception {
		session = ActionContext.getContext().getSession();
		// 判断验证码是否正确
		if (user.getCode().equals(captcha)) {
			if (account.equals("wesley") && password.equals("123")) {
				logger.info("用户："+ account + "登录系统！---"+ time);
				manager = userService.getManagerByAccount(account);
				session.put("username", manager.getUsername());	// 将用户名保存到Session会话中
				session.put("role", manager.getRole());	// 将管理员的权限放在Session会话中
				return SUCCESS;
			} else {
				logger.warn("登录系统，密码或用户名出错！---"+ time);
				return LOGIN;
			}
		} else {
			logger.error("验证码不正确！---"+ time);
			return ERROR;
		}
	}
	
	/**
	 * 退出系统
	 * @return
	 */
	@Actions({ @Action(value = "logout", results = {
			@Result(name = "success", location = "/login.jsp"),
			@Result(name = "error", location = "/error.jsp") }) })
	public String logout() throws Exception {
		logger.info(account + "退出系统---"+ time);
		session.remove("username");	// 将用户名从Session会话中删除
		session.remove("role");		// 将权限从Session会话中删除
		return SUCCESS;
	}
}
