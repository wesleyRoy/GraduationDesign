package org.dongxin.wesley.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author 	���޻�ǿ
 * email 	��1360042977@qq.com
 * fileName	: Department.java
 * ����		��2013-12-11
 * ��ϸע��	��TODO
 *
 */

@Entity
@Table(name="Department",schema="InformationSystem")
public class Department implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 8999096434842898405L;
	private Integer id;			// �������
	private String departId;	// ���ű��
	private String departName;	// ��������
	private Date createTime;	// ����ʱ��
	private String manager;		// ���ž���
	private String remark;		// ��ע

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",length=11,unique=true,insertable=true,updatable=true,nullable=false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="departId",length=4,unique=true,insertable=true,updatable=true,nullable=false)
	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	@Column(name="departName",length=20,unique=true,insertable=true,updatable=true,nullable=false)
	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="createTime",length=20,unique=true,insertable=true,updatable=true,nullable=false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name="manager",length=20,unique=true,insertable=true,updatable=true,nullable=false)
	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Column(name="remark",length=500,unique=true,insertable=true,updatable=true,nullable=false)
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
