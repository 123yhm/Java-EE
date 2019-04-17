package com.jd.bms.sysmannage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.BmUserPersonService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: BmUserAction
 * @Description: 用户个人信息密码修改页面
 * @author 浩明
 * @date 2018年6月9日 下午7:17:10
 *
 */
public class BmUserPwdAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */

	@Autowired
	private BmUserPersonService bmUserPersonService;
	private BmUser bmUser;
	// 新密码
	private String newpassword;
	// 旧密码
	private String oldpassword;

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public BmUser getBmUser() {
		return bmUser;
	}

	public void setBmUser(BmUser bmUser) {
		this.bmUser = bmUser;
	}

	public String pwdmodil() throws Exception {
		return "pwd";
	}

	public String pwdupdate() throws Exception {
		System.out.println("123456");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		List<BmUser> userpwd = (List<BmUser>) session.getAttribute("listpwd");

		System.out.println("当前用户：" + userpwd);
		Integer userid = 0;
		String userpwds = "";
		for (int i = 0; i < userpwd.size(); i++) {
			userid += userpwd.get(i).getId();
			userpwds += userpwd.get(i).getPassword();
		}

		if (userpwds.equals(oldpassword)) {// 判断是否与原密码相同
			BmUser bm = new BmUser(userid, null, newpassword, null, null, null,
					null, null, null, null, null, null);
			int i = bmUserPersonService.updateBmUserPwd(bm);

			if (i != 0) {
				return "toLogin";
			} else {
				ActionContext ctx = ActionContext.getContext();
				ctx.put("pwderror", "修改密码失败");
				return "pwdupdate";
			}

		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("pwderror", "原密码输入不匹配");
			return "pwdupdate";
		}

	}
}
