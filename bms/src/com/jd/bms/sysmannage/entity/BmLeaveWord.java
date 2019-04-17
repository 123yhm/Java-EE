package com.jd.bms.sysmannage.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: BmLeaveWord
 * @Description:留言管理
 * @author 浩明
 * @date 2018年6月5日 下午9:34:27
 *
 */

@Entity
@Table(name = "bm_leave_word")
public class BmLeaveWord implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -949855737224874989L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "leaveword", length = 128, nullable = false)
	private String leaveword;
	@Column(name = "login_name", length = 32, nullable = false)
	private String loginName;
	@Column(name = "leaveword_time", nullable = false)
	private Date leavewordTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveword() {
		return leaveword;
	}

	public void setLeaveword(String leaveword) {
		this.leaveword = leaveword;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Date getLeavewordTime() {
		return leavewordTime;
	}

	public void setLeavewordTime(Date leavewordTime) {
		this.leavewordTime = leavewordTime;
	}

	public BmLeaveWord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BmLeaveWord(Integer id, String leaveword, String loginName,
			Date leavewordTime) {
		super();
		this.id = id;
		this.leaveword = leaveword;
		this.loginName = loginName;
		this.leavewordTime = leavewordTime;
	}

	@Override
	public String toString() {
		return "BmLeaveWord [id=" + id + ", leaveword=" + leaveword
				+ ", loginName=" + loginName + ", leavewordTime="
				+ leavewordTime + "]";
	}

}
