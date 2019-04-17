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
 * @Description: 用户个人信息crud页面
 * @author 浩明
 * @date 2018年6月9日 下午7:17:10
 *
 */
public class BmUserAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4039337707725854204L;
	@Autowired
	private BmUserPersonService bmUserPersonService;
	private BmUser bmUser;
	private String loginName;// 搜索条件

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public BmUser getBmUser() {
		return bmUser;
	}

	public void setBmUser(BmUser bmUser) {
		this.bmUser = bmUser;
	}

	/**
	 * 
	 * @Title: person
	 * @Description: 根据登录的用户判断输出的数据
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String person() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String loginName = (String) session.getAttribute("loginname");
		List<BmUser> list = bmUserPersonService.getBmUser(loginName);
		ActionContext ctx = ActionContext.getContext();
		session.setAttribute("listpwd", list);
		ctx.put("listproper", list);
		return "person";
	}

	/**
	 * 
	 * @Title: userupdate
	 * @Description: 个人信息修改
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String userupdate() throws Exception {
		System.out.println("123");
		Integer id = bmUser.getId();
		String loginname = bmUser.getLoginName();
		String name = bmUser.getName();
		Integer age = bmUser.getAge();
		String sex = bmUser.getSex();
		Integer serialnumber = bmUser.getSerialnumber();
		String school = bmUser.getSchool();
		String phool = bmUser.getPhone();
		String email = bmUser.getEmail();
		String mobile = bmUser.getMobile();
		String selfhood = bmUser.getSelfhood();
		System.out.println("个性：" + selfhood);
		BmUser bm = new BmUser(id, loginname, null, name, age, sex,
				serialnumber, school, phool, email, mobile, selfhood);
		int i = bmUserPersonService.updateBmUser(bm);
		if (i != 0) {
			return "userupdate";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("error", "修改失败！请注意查看条件信息");
			return "input";
		}

	}

	/**
	 * 
	 * @Title: user_page
	 * @Description: 根据用户名查找数据
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String user_page() throws Exception {
		System.out.println("123456");
		System.out.println(">>>>>" + loginName);
		if (loginName == null || loginName.length() <= 0) {
			return "usermain_page";
		} else {
			List<BmUser> list = bmUserPersonService.getBmUser(loginName);
			if (list.size() > 0 && list != null) {
				ActionContext ctx = ActionContext.getContext();
				ctx.put("bmuser_one", list);
				return "user_page";
			} else {
				ActionContext ctx = ActionContext.getContext();
				ctx.put("user_error", "搜索失败，没有改用户");
				return "input";
			}

		}
	}
}
