package com.jd.bms.sysmannage.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmAdmin;
import com.jd.bms.sysmannage.service.BmAdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BmAdminAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 4297180770984426910L;
	@Autowired
	private BmAdminService bmAdminService;
	private BmAdmin bmAdmin;

	public BmAdmin getBmAdmin() {
		return bmAdmin;
	}

	public void setBmAdmin(BmAdmin bmAdmin) {
		this.bmAdmin = bmAdmin;
	}

	public String adminmess() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String loginName = (String) session.getAttribute("loginname");
		System.out.println("123456");
		List<BmAdmin> list = bmAdminService.getBmAdminLoginName(loginName);
		System.out.println(list);
		ActionContext ctx = ActionContext.getContext();
		System.out.println("123963");
		ctx.put("adminme", list);

		return "admin";
	}

	public String updateAdmin() throws Exception {

		Integer id = bmAdmin.getId();
		String name = bmAdmin.getName();
		String loginname = bmAdmin.getLoginName();
		String email = bmAdmin.getEmail();
		String serialnumber = bmAdmin.getSerialnumber();
		String mobile = bmAdmin.getMobile();
		BmAdmin bmAd = new BmAdmin(id, loginname, null, name, serialnumber,
				email, mobile);
		System.out.println(">>>>>>>>>>" + bmAd);
		int i = bmAdminService.updateBmAdmin(bmAd);
		if (i == 1) {
			return "updateAdmin";
		} else {
			return "input";
		}

	}
}
