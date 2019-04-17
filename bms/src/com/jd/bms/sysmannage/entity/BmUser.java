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
 * @Description: 用户表
 * @author 浩明
 * @date 2018年5月16日 下午9:08:56
 *
 */

@Entity
@Table(name = "bm_user")
public class BmUser implements Serializable {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -775681044340164708L;
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
	@Column(name = "serialnumber", length = 32, nullable = false, unique = true)
	private Integer serialnumber;
	@Column(name = "sex", length = 2, nullable = false)
	private String sex;
	@Column(name = "age", length = 32, nullable = false)
	private Integer age;
	@Column(name = "school", length = 64, nullable = false)
	private String school;
	@Column(name = "email", length = 32, nullable = false, unique = true)
	private String email;
	@Column(name = "phone", length = 32, nullable = false)
	private String phone;
	@Column(name = "mobile", length = 32, nullable = false)
	private String mobile;
	@Column(name = "selfhood", length = 32)
	private String selfhood;

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

	public Integer getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(Integer serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSelfhood() {
		return selfhood;
	}

	public void setSelfhood(String selfhood) {
		this.selfhood = selfhood;
	}

	public BmUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BmUser(Integer id, String loginName, String password, String name,
			Integer serialnumber, String sex, Integer age, String school,
			String email, String phone, String mobile, String selfhood) {
		super();
		this.id = id;
		this.loginName = loginName;
		this.password = password;
		this.name = name;
		this.serialnumber = serialnumber;
		this.sex = sex;
		this.age = age;
		this.school = school;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
		this.selfhood = selfhood;
	}

	@Override
	public String toString() {
		return "BmUser [id=" + id + ", loginName=" + loginName + ", password="
				+ password + ", name=" + name + ", serialnumber="
				+ serialnumber + ", sex=" + sex + ", age=" + age + ", school="
				+ school + ", email=" + email + ", phone=" + phone
				+ ", mobile=" + mobile + ", selfhood=" + selfhood + "]";
	}

}
