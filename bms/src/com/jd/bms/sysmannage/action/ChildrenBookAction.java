package com.jd.bms.sysmannage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.service.BmChildBookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: ChildrenBookAction
 * @Description:儿童页面数据交互
 * @author 浩明
 * @date 2018年6月3日 上午9:43:21
 *
 */
public class ChildrenBookAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 8646542806714521L;
	@Autowired
	private BmChildBookService bmChildBookService;

	public String Child() throws Exception {// 数据库查询
		ActionContext ctx = ActionContext.getContext();
		List<BmChildBook> listchild = bmChildBookService.getBmChildBook();
		ctx.put("listChild", listchild);
		return "Child";
	}
}
