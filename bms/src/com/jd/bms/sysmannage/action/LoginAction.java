package com.jd.bms.sysmannage.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.service.BmChildBookService;
import com.jd.bms.sysmannage.service.BmItBookService;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;
import com.jd.bms.sysmannage.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: LoginAction
 * @Description: 登录控制层
 * @author 浩明
 * @date 2018年5月16日 下午9:09:47
 *
 */

public class LoginAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : 序列化
	 */
	private static final long serialVersionUID = -5909634130848855585L;
	/**
	 * 登录服务
	 */
	@Autowired
	private LoginService loginserviceimpl;
	/**
	 * 查询所有表的书籍显示在首页
	 */
	@Autowired
	private BmLiteraryBookService bmLiteraryBookService;
	@Autowired
	private BmChildBookService bmChildBookService;
	@Autowired
	private BmItBookService bmItBookService;

	private String loginname;// 登录名
	private String password;// 密码
	private String Management;// 复选框值
	// 提示变量
	private String loginError;
	/**
	 * 获取复选框的值
	 */
	String[] checkbox = ServletActionContext.getRequest().getParameterValues(
			"Management");

	/**
	 * 
	 * @Title: toLogin
	 * @Description: 进入登录页面
	 * @param @return 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String toLogin() {

		return "toLogin";
	}

	/**
	 * 登录验证
	 */
	public String login() throws Exception {
		String check = null;
		boolean flag = false;

		if (checkbox == null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("loginErrorMsg", "请选择登录模块");
			return "loginPage";
		} else if (checkbox.length == 1) {

			for (int i = 0; i < checkbox.length; i++) {
				String checkbox2 = checkbox[i];
				check = checkbox2;
			}
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("loginErrorMsg", "只能选择一个登录模块");
			return "loginPage";

		}

		if (loginname.equals("") && password.equals("")) {

			ActionContext ctx = ActionContext.getContext();
			ctx.put("loginErrorMsg", "用户名密码不为空");
			return "loginPage";

		} else {

			if (check.equals("学生")) {
				flag = loginserviceimpl.getBmLogin(loginname, password);
				if (flag == true) {
					System.out.println("123");
					// 获取session
					HttpSession session = ServletActionContext.getRequest()
							.getSession();
					// 获取action的上下文对象

					// 存放用户名
					session.setAttribute("loginname", loginname);

					return "main";
				} else {
					ActionContext ctx = ActionContext.getContext();
					ctx.put("loginErrorMsg", "用户名密码不匹配");
					return "loginPage";
				}
			} else if (check.equals("管理员")) {
				flag = loginserviceimpl.getBmAdmin(loginname, password);
				if (flag == true) {
					System.out.println("123");
					HttpSession session = ServletActionContext.getRequest()
							.getSession();
					session.setAttribute("loginname", loginname);
					return "usermain";
				} else {
					ActionContext ctx = ActionContext.getContext();
					ctx.put("loginErrorMsg", "用户名密码不匹配");
					return "loginPage";
				}
			} else {
				ActionContext ctx = ActionContext.getContext();
				ctx.put("loginErrorMsg", "登录身份错误");
				return "loginPage";
			}

		}

	}

	/**
	 * 
	 * @Title: main
	 * @Description: 验证进入主页面
	 * @param @return 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String main() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		List<BmLiteraryBook> listliter = bmLiteraryBookService
				.getbmLiteraryBook();// 文学小说
		List<BmChildBook> listchild = bmChildBookService.getBmChildBook();// 少年儿童表
		List<BmItBook> listit = bmItBookService.getBmItBook();// It科技表

		ctx.put("listLiter", listliter);
		ctx.put("listChild", listchild);
		ctx.put("listIt", listit);
		return "mainpage";
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getManagement() {
		return Management;
	}

	public void setManagement(String management) {
		Management = management;
	}

}
