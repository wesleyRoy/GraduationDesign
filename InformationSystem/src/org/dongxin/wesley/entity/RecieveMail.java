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
 * fileName	: RecieveMail.java
 * ����		��2013-12-11
 * ��ϸע��	�������ʼ���Ϣ
 *
 */

@Entity
@Table(name="RecieveMail",schema="InformationSystem")
public class RecieveMail implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 8559545312589026311L;
	private Integer id;			// �������
	private String mailFrom;	// ������
	private String subject;		// ����
	private String content;		// ����
	private String attachment;	// ����
	private char flag;			// �ʼ���� 0δ����1�Ѷ�
	private Date recieveTime; // ����ʱ��

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",length=11,unique=true,insertable=true,updatable=true,nullable=false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="mailFrom",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	@Column(name="subject",length=30,unique=false,insertable=true,updatable=true,nullable=false)
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name="content",length=500,unique=false,insertable=true,updatable=true,nullable=false)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name="attachment",length=500,unique=false,insertable=true,updatable=true,nullable=false)
	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	@Column(name="flag",length=500,unique=false,insertable=true,updatable=true,nullable=false)
	public char getFlag() {
		return flag;
	}

	public void setFlag(char flag) {
		this.flag = flag;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="recieveTime",length=20,unique=true,insertable=true,updatable=true,nullable=false)
	public Date getRecieveTime() {
		return recieveTime;
	}

	public void setRecieveTime(Date recieveTime) {
		this.recieveTime = recieveTime;
	}
}
