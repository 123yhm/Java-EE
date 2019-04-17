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
 * @ClassName: BmKind
 * @Description:图书种类
 * @author 浩明
 * @date 2018年6月5日 下午9:40:34
 *
 */
@Entity
@Table(name = "bm_kind")
public class BmKind implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4661578624525941967L;

	@Id
	@Column(name = "bm_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bmId;
	@Column(name = "bm_bookname", length = 32, nullable = false)
	private String bmBookname;
	@Column(name = "bm_name", length = 32, nullable = false)
	private String bmName;
	@Column(name = "k_time", nullable = false)
	private Date kTime;

	public BmKind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BmKind(Integer bmId, String bmBookname, String bmName, Date kTime) {
		super();
		this.bmId = bmId;
		this.bmBookname = bmBookname;
		this.bmName = bmName;
		this.kTime = kTime;
	}

	@Override
	public String toString() {
		return "BmKind [bmId=" + bmId + ", bmBookname=" + bmBookname
				+ ", bmName=" + bmName + ", kTime=" + kTime + "]";
	}

	public Integer getBmId() {
		return bmId;
	}

	public void setBmId(Integer bmId) {
		this.bmId = bmId;
	}

	public String getBmBookname() {
		return bmBookname;
	}

	public void setBmBookname(String bmBookname) {
		this.bmBookname = bmBookname;
	}

	public String getBmName() {
		return bmName;
	}

	public void setBmName(String bmName) {
		this.bmName = bmName;
	}

	public Date getkTime() {
		return kTime;
	}

	public void setkTime(Date kTime) {
		this.kTime = kTime;
	}

}
