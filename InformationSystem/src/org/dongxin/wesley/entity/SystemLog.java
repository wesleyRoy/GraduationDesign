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
 * fileName	: SystemLog.java
 * ����		��2013-12-11
 * ��ϸע��	��TODO
 *
 */

@Entity
@Table(name="SystemLog",schema="InformationSystem")
public class SystemLog implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = -4171834593488141605L;
	private Integer id;			// �������
	private String operatorId;  // ����Ա���
	private String operator;	// ����Ա����
	private String operateType;	// ��������
	private Date operateTime;	// ����ʱ��
	private String operateIp;	// IP��ַ

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",length=11,unique=true,insertable=true,updatable=true,nullable=false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="operatorId",length=12,unique=false,insertable=true,updatable=true,nullable=false)
	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	@Column(name="operator",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name="operateType",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="operateTime",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	@Column(name="operateIp",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public String getOperateIp() {
		return operateIp;
	}

	public void setOperateIp(String operateIp) {
		this.operateIp = operateIp;
	}
}
