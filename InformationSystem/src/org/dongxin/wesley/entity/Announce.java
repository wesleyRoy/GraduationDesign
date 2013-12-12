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
 * fileName	: Announce.java
 * ����		��2013-12-11
 * ��ϸע��	��������Ϣ
 *
 */

@Entity
@Table(name="Announce",schema="InformationSystem")
public class Announce implements Serializable {

	/**
	 * Fields
	 */
	private static final long serialVersionUID = 4126472376518954794L;
	private Integer id;		// �������
	private String title;	// �������
	private String content;	// ��������
	private String announcerId;	// �����˱��
	private String announcer;	// ����������
	private Date announceTime;	// ����ʱ��
	private String depart;	// ��������������
	private Integer count;	// �������
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",length=11,unique=true,updatable=true,insertable=true,nullable=false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="title",length=30,unique=false,updatable=true,insertable=true,nullable=false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="content",length=1000,unique=false,updatable=true,insertable=true,nullable=false)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name="announcerId",length=12,unique=false,updatable=true,insertable=true,nullable=false)
	public String getAnnouncerId() {
		return announcerId;
	}

	public void setAnnouncerId(String announcerId) {
		this.announcerId = announcerId;
	}

	@Column(name="announcer",length=20,unique=false,updatable=true,insertable=true,nullable=false)
	public String getAnnouncer() {
		return announcer;
	}

	public void setAnnouncer(String announcer) {
		this.announcer = announcer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="announceTime",length=20,unique=false,updatable=true,insertable=true,nullable=false)
	public Date getAnnounceTime() {
		return announceTime;
	}

	public void setAnnounceTime(Date announceTime) {
		this.announceTime = announceTime;
	}

	@Column(name="depart",length=30,unique=false,updatable=true,insertable=true,nullable=false)
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Column(name="count",length=8,unique=false,updatable=true,insertable=true,nullable=false)
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
