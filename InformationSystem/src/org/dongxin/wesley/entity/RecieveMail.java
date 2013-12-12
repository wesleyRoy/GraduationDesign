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
 * fileName	: RecieveMail.java
 * 日期		：2013-12-11
 * 详细注释	：接收邮件信息
 *
 */

@Entity
@Table(name="RecieveMail",schema="InformationSystem")
public class RecieveMail implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 8559545312589026311L;
	private Integer id;			// 自增编号
	private String mailFrom;	// 发送者
	private String subject;		// 主题
	private String content;		// 内容
	private String attachment;	// 附件
	private char flag;			// 邮件标记 0未读，1已读
	private Date recieveTime; // 接收时间

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
