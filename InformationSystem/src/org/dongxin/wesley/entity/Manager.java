package org.dongxin.wesley.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: Manager.java
 * 日期		：2013-12-11
 * 详细注释	：TODO
 *
 */

@Entity
@Table(name = "Manager", schema = "InformationSystem")
public class Manager implements Serializable {

	/**
	 * Field
	 */
	private static final long serialVersionUID = -323678323106359724L;
	private Integer id; // 自增编号
	private String account; // 用户编号
	private String username; // 用户名称
	private char gender; // 性别	  0表示女，1表示男
	private Integer age; // 年龄
	private String password; // 密码
	private String telephone; // 电话号码
	private String address; // 家庭住址
	private String email; // 邮箱
	private char role; // 级别	0表示普通用户，1表示管理员

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",length=11,nullable=false,unique=true,insertable=true,updatable=true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="account",length=12,nullable=false,unique=true,insertable=true,updatable=true)
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name="username",length=20,nullable=false,unique=true,insertable=true,updatable=true)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="gender",length=1,nullable=false,unique=false,insertable=true,updatable=true)
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Column(name="age",length=3,nullable=false,unique=true,insertable=true,updatable=true)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Column(name="password",length=20,nullable=false,unique=false,insertable=true,updatable=true)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="telephone",length=14,nullable=false,unique=false,insertable=true,updatable=true)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name="address",length=30,nullable=false,unique=false,insertable=true,updatable=true)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="email",length=20,nullable=false,unique=false,insertable=true,updatable=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="role",length=1,nullable=false,unique=false,insertable=true,updatable=true)
	public char getRole() {
		return role;
	}

	public void setRole(char role) {
		this.role = role;
	}

}
