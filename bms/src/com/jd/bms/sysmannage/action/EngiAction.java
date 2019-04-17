package com.jd.bms.sysmannage.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: EngiAction
 * @Description: 注册控制
 * @author 浩明
 * @date 2018年5月22日 下午7:28:40
 *
 */
public class EngiAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : 序列化
	 */
	private static final long serialVersionUID = -9118451620286555321L;
	@Autowired
	private LoginService loginservice;
	private BmUser bmuser;

	public BmUser getBmuser() {
		return bmuser;
	}

	public void setBmuser(BmUser bmuser) {
		this.bmuser = bmuser;
	}

	public String engi() throws Exception {
		String loginname = bmuser.getLoginName();
		String password = bmuser.getPassword();
		String name = bmuser.getName();
		Integer serialnumber = bmuser.getSerialnumber();
		String sex = bmuser.getSex();
		Integer age = bmuser.getAge();
		String school = bmuser.getSchool();
		String email = bmuser.getEmail();
		String phone = bmuser.getPhone();
		String mobile = bmuser.getMobile();
		System.out.println(school);
		BmUser bmusers = new BmUser(null, loginname, password, name,
				serialnumber, sex, age, school, email, phone, mobile, null);
		int i = loginservice.addEngi(bmusers);
		if (i != 0) {
			return "toLogin";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("insertError", "插入失败");
			return "regiPage";
		}

	}
}
