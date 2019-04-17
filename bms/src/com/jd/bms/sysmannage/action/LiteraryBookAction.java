package com.jd.bms.sysmannage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: LiteraryBookAction
 * @Description:文学数据交互
 * @author 浩明
 * @date 2018年6月3日 上午11:08:33
 *
 */
public class LiteraryBookAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4986724981079528939L;
	@Autowired
	private BmLiteraryBookService bmLiteraryBookService;

	public String Literary() {
		ActionContext ctx = ActionContext.getContext();
		List<BmLiteraryBook> listliter = bmLiteraryBookService
				.getbmLiteraryBook();

		ctx.put("listLiter", listliter);
		return "Literary";
	}

}
