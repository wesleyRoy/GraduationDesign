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
 * @author 	：罗华强
 * email 	：1360042977@qq.com
 * fileName	: SendMail.java
 * 日期		：2013-12-11
 * 详细注释	：发送邮件信息
 *
 */

@Entity
@Table(name="SendMail",schema="InformationSystem")
public class SendMail implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 328412608053895324L;
	private Integer id;			// 自增编号
	private String mailFrom;	// 发送者
	private String mailTo;		// 接收者
	private String subject;		// 主题
	private String content;		// 内容
	private String attachment;	// 附件
	private Date sendTime; // 发送时间

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

	@Column(name="mailTo",length=50,unique=false,insertable=true,updatable=true,nullable=false)
	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
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

	@Column(name="attachment",length=500,unique=true,insertable=true,updatable=true,nullable=false)
	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="sendTime",length=20,unique=false,insertable=true,updatable=true,nullable=false)
	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
