package com.jd.bms.sysmannage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmKind;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.BmChildBookService;
import com.jd.bms.sysmannage.service.BmItBookService;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;
import com.jd.bms.sysmannage.service.BmUserBookService;
import com.jd.bms.sysmannage.service.BookKandService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: mainAction
 * @Description: 分页管理控制层
 * @author 浩明
 * @date 2018年5月22日 下午7:28:24
 *
 */
public class PagingAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID : 序列化
	 */
	private static final long serialVersionUID = 6702594165404450722L;
	private int curre;// 每页的起始数据
	private int allcount = 7;// 每页显示的数量
	private int maxpage = 1;// 最大页
	private int page = 1;// 当前页
	/**
	 * 图书分页服务
	 */
	// 后台图书信息、分页3、图书种类1、用户信息分页1、
	@Autowired
	private BmLiteraryBookService bookService;
	@Autowired
	private BmChildBookService bmChildBookService;
	@Autowired
	private BmItBookService bmItBookService;
	@Autowired
	private BookKandService bookKandService;
	@Autowired
	private BmUserBookService bmUserBookService;

	public int getCurre() {
		return curre;
	}

	public void setCurre(int curre) {
		this.curre = curre;
	}

	public int getAllcount() {
		return allcount;
	}

	public void setAllcount(int allcount) {
		this.allcount = allcount;
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

	public String bookshow() throws Exception {
		// 判断最大页码
		int max = bookService.getbmLiteraryBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}

		// 计算每页的起始页的数据
		curre = (page - 1) * allcount;
		List<BmLiteraryBook> list = bookService.getbmLiteraryBook(curre,
				allcount);
		ActionContext ctx = ActionContext.getContext();
		ctx.put("bookList", list);
		System.out.println(list);
		return "bookshow";

	}

	/**
	 * 
	 * @Title: bookshowtwo
	 * @Description:分页二
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String bookshowtwo() throws Exception {
		System.out.println("2");
		// 判断最大页码
		int max = bmChildBookService.getBmChildBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}

		// 计算每页的起始页的数据
		curre = (page - 1) * allcount;
		List<BmChildBook> list = bmChildBookService.getBmChildBook(curre,
				allcount);
		ActionContext ctx = ActionContext.getContext();

		ctx.put("bookListtwo", list);
		return "bookshowtwo";

	}

	/**
	 * 
	 * @Title: bookshowtwo
	 * @Description:分页三
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String bookshowthree() throws Exception {
		System.out.println("3");
		// 判断最大页码
		int max = bmItBookService.getBmItBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}

		// 计算每页的起始页的数据
		curre = (page - 1) * allcount;
		List<BmItBook> list = bmItBookService.getBmItBook(curre, allcount);
		ActionContext ctx = ActionContext.getContext();

		ctx.put("bookListthree", list);
		return "bookshowthree";

	}

	/**
	 * 
	 * @Title: bookbank
	 * @Description: 图书种类分页
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String bookbank() throws Exception {
		int max = bookKandService.getBmKindBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}

		// 计算每页的起始页的数据
		curre = (page - 1) * allcount;
		List<BmKind> list = bookKandService.getBmKindBook(curre, allcount);
		ActionContext ctx = ActionContext.getContext();

		ctx.put("bmKind", list);
		return "bookbank";
	}

	/**
	 * 
	 * @Title: usermain
	 * @Description: 用户分页查询
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String usermain() throws Exception {
		int max = bmUserBookService.getBmUserBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}
		curre = (page - 1) * allcount;
		List<BmUser> bmuserbook = bmUserBookService.getBmUserBook(curre,
				allcount);
		ActionContext ctx = ActionContext.getContext();
		ctx.put("bmuser", bmuserbook);
		return "usermain";
	}

}
