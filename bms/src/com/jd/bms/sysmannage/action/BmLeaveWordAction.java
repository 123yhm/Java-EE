package com.jd.bms.sysmannage.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmLeaveWord;
import com.jd.bms.sysmannage.service.BmLeaveWordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: BmLeaveWordAction
 * @Description:留言分页、添加页面/后台的查看、回复、删除
 * @author 浩明
 * @date 2018年6月9日 下午7:17:52
 *
 */
public class BmLeaveWordAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4008028512473056924L;
	@Autowired
	private BmLeaveWordService bmLeaveWordService;
	private BmLeaveWord bmLeaveWord;
	private HttpSession session = ServletActionContext.getRequest()
			.getSession();

	private int currpage;// 每页的起始数据
	private int allcout = 6;// 每页显示的数量
	private int maxpage = 1;// 最大页
	private int page = 1;// 当前页

	public BmLeaveWord getBmLeaveWord() {
		return bmLeaveWord;
	}

	public void setBmLeaveWord(BmLeaveWord bmLeaveWord) {
		this.bmLeaveWord = bmLeaveWord;
	}

	public int getCurrpage() {
		return currpage;
	}

	public void setCurrpage(int currpage) {
		this.currpage = currpage;
	}

	public int getAllcout() {
		return allcout;
	}

	public void setAllcout(int allcout) {
		this.allcout = allcout;
	}

	public int getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String message() throws Exception {

		int max = bmLeaveWordService.getBmLeaveWordmessageCount();
		if (max % allcout == 0) {
			maxpage = max / allcout;
		} else {
			maxpage = max / allcout + 1;
		}

		// 计算每页的起始页的数据
		currpage = (page - 1) * allcout;
		List<BmLeaveWord> list = bmLeaveWordService.getBmLeaveWordmessage(
				currpage, allcout);

		ActionContext ctx = ActionContext.getContext();
		ctx.put("messagelist", list);
		return "message";
	}

	public String agsLeaveWord() throws Exception {
		String aggess = bmLeaveWord.getLeaveword();// 留言
		Date aggessTime = new Date();
		String username = (String) session.getAttribute("loginname");
		BmLeaveWord bmLeaveWord = new BmLeaveWord(null, aggess, username,
				aggessTime);

		bmLeaveWordService.addBmLeaveWordmessage(bmLeaveWord);
		return "message";
	}

	public String messagex() throws Exception {
		int max = bmLeaveWordService.getBmLeaveWordmessageCount();
		if (max % allcout == 0) {
			maxpage = max / allcout;
		} else {
			maxpage = max / allcout + 1;
		}

		// 计算每页的起始页的数据
		currpage = (page - 1) * allcout;
		List<BmLeaveWord> list = bmLeaveWordService.getBmLeaveWordmessage(
				currpage, allcout);

		ActionContext ctx = ActionContext.getContext();
		ctx.put("messagelist", list);
		return "messagex";
	}

	public String delmess() throws Exception {
		Integer id = bmLeaveWord.getId();
		bmLeaveWordService.deletemess(id);
		return "delmess";
	}
}
