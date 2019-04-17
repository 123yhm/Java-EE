package com.jd.bms.sysmannage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: User
 * @Description: 管理员表
 * @author 浩明
 * @date 2018年5月16日 下午9:08:56
 *
 */

@Entity
@Table(name = "bm_admin")
public class BmAdmin implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 5938178566540780464L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "login_name", length = 100, nullable = false, unique = true)
	private String loginName;
	@Column(name = "password", length = 32, nullable = false)
	private String password;
	@Column(name = "name", length = 32, nullable = false, unique = true)
	private String name;
	@Column(name = "serialnumber", length = 32, nullable = false)
	private String serialnumber;
	@Column(name = "email", length = 32, nullable = false)
	private String email;
	@Column(name = "mobile", length = 32, nullable = false)
	private String mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "BmAdmin [id=" + id + ", loginName=" + loginName + ", password="
				+ password + ", name=" + name + ", serialnumber="
				+ serialnumber + ", email=" + email + ", mobile=" + mobile
				+ "]";
	}

	public BmAdmin(Integer id, String loginName, String password, String name,
			String serialnumber, String email, String mobile) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.serialnumber = serialnumber;
		this.email = email;
		this.mobile = mobile;
	}

	public BmAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
