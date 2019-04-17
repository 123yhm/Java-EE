package com.jd.bms.sysmannage.action;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmOrder;
import com.jd.bms.sysmannage.service.BmChildBookService;
import com.jd.bms.sysmannage.service.BmItBookService;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;
import com.jd.bms.sysmannage.service.ShopBmBookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @ClassName: bookshopAction
 * @Description: 用户淘书
 * @author 浩明
 * @date 2018年6月21日 下午10:25:37
 *
 */

public class BookshopAction extends ActionSupport {

	/**
	 * @Fields serialVersionUID :序列号
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ShopBmBookService shopBmBookService;

	private int curre;// 每页的起始数据
	private int allcount = 4;// 每页显示的数量
	private int maxpage = 1;// 最大页
	private int page = 1;// 当前页

	// 文学小说表
	@Autowired
	private BmLiteraryBookService bmLiteraryBookService;
	/**
	 * 首页图书--少年儿童表
	 */
	// 少年儿童表
	@Autowired
	private BmChildBookService bmChildBookService;
	// IT科技表
	@Autowired
	private BmItBookService bmItBookService;
	/**
	 * 图书三张表对象
	 */
	private BmLiteraryBook bmLiteraryBook;
	private BmChildBook bmChildBook;
	private BmItBook bmItBook;
	private BmOrder bmOrder;

	/**
	 * 
	 * @Title: bookshop
	 * @Description: 查询购物车数据
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String bookshop() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String loginName = (String) session.getAttribute("loginname");
		int max = shopBmBookService.getBmOrderBookCount();
		if (max % allcount == 0) {
			maxpage = max / allcount;
		} else {
			maxpage = max / allcount + 1;
		}
		curre = (page - 1) * allcount;
		List<BmOrder> bmuserbook = shopBmBookService.getBmOrderBook(curre,
				allcount, loginName);
		ActionContext ctx = ActionContext.getContext();
		ctx.put("bmuser", bmuserbook);
		return "bookshop";
	}

	/**
	 * 
	 * @Title: addShop
	 * @Description: 首页(其他表的数据都存在)数据插入数据库
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String litBook() throws Exception {
		System.out.println("开始");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		String loginName = (String) session.getAttribute("loginname");
		System.out.println(">>>>" + loginName);
		Integer bookid = bmChildBook.getBookId();
		System.out.println("123" + bookid);
		List<BmChildBook> list = shopBmBookService.getBmChildBook(bookid);
		Date newbooktime = new Date();// 订单时间
		String isbm = "";// 图书编号
		String bookName = "";// 图书名称
		String bookAuthor = "";// 图书作者
		Integer bookRepertory = 0;// 图书数量
		BigDecimal bookPrice = new BigDecimal(0);// 图书价钱
		String bookPress = "";// 图书出版社
		String bookAddres = "";// 图书地址
		Integer bookState = 1;
		Date bookTime = new Date();
		for (int i = 0; i < list.size(); i++) {
			isbm = list.get(i).getBookIsbn();
			bookName = list.get(i).getBookName();
			bookAuthor = list.get(i).getBookAuthor();
			bookRepertory = list.get(i).getBookRepertory();
			bookPrice = list.get(i).getBookPrice();
			bookPress = list.get(i).getBookPress();
			bookAddres = list.get(i).getBookAddres();
			bookTime = list.get(i).getBookTime();
		}

		BmOrder bmOrder = new BmOrder(null, loginName, newbooktime, isbm,
				bookName, bookAuthor, bookRepertory, bookPrice, bookTime,
				bookPress, bookAddres, bookState);
		System.out.println("遍历的结果" + bmOrder);
		int i = shopBmBookService.addShopBook(bmOrder);
		if (i != 0) {
			System.out.println("结束");
			return "libBook";
		} else {

			return "error";
		}

	}

	/**
	 * 
	 * @Title: literyBook
	 * @Description: 文学小说页
	 * @param @return 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String literyBook() throws Exception {
		System.out.println("开始");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		String loginName = (String) session.getAttribute("loginname");
		System.out.println(">>>>" + loginName);
		Integer bookid = bmLiteraryBook.getBookId();
		System.out.println("123" + bookid);
		List<BmLiteraryBook> list = shopBmBookService.getBmLiteraryBook(bookid);
		Date newbooktime = new Date();// 订单时间
		String isbm = "";// 图书编号
		String bookName = "";// 图书名称
		String bookAuthor = "";// 图书作者
		Integer bookRepertory = 0;// 图书数量
		BigDecimal bookPrice = new BigDecimal(0);// 图书价钱
		String bookPress = "";// 图书出版社
		String bookAddres = "";// 图书地址
		Integer bookState = 1;
		Date bookTime = new Date();
		for (int i = 0; i < list.size(); i++) {
			isbm = list.get(i).getBookIsbn();
			bookName = list.get(i).getBookName();
			bookAuthor = list.get(i).getBookAuthor();
			bookRepertory = list.get(i).getBookRepertory();
			bookPrice = list.get(i).getBookPrice();
			bookPress = list.get(i).getBookPress();
			bookAddres = list.get(i).getBookAddres();
			bookTime = list.get(i).getBookTime();
		}

		BmOrder bmOrder = new BmOrder(null, loginName, newbooktime, isbm,
				bookName, bookAuthor, bookRepertory, bookPrice, bookTime,
				bookPress, bookAddres, bookState);
		int i = shopBmBookService.addShopBook(bmOrder);
		if (i != 0) {
			System.out.println("结束");
			return "literyBook";
		} else {
			return "error";
		}

	}

	/**
	 * 
	 * @Title: childBook
	 * @Description: 少儿童书页
	 * @param @return
	 * @param @throws Exception 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String childBook() throws Exception {
		System.out.println("开始");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		String loginName = (String) session.getAttribute("loginname");
		System.out.println(">>>>" + loginName);
		Integer bookid = bmChildBook.getBookId();
		System.out.println("123" + bookid);
		List<BmChildBook> list = shopBmBookService.getBmChildBook(bookid);
		Date newbooktime = new Date();// 订单时间
		String isbm = "";// 图书编号
		String bookName = "";// 图书名称
		String bookAuthor = "";// 图书作者
		Integer bookRepertory = 0;// 图书数量
		BigDecimal bookPrice = new BigDecimal(0);// 图书价钱
		String bookPress = "";// 图书出版社
		String bookAddres = "";// 图书地址
		Integer bookState = 1;
		Date bookTime = new Date();
		for (int i = 0; i < list.size(); i++) {
			isbm = list.get(i).getBookIsbn();
			bookName = list.get(i).getBookName();
			bookAuthor = list.get(i).getBookAuthor();
			bookRepertory = list.get(i).getBookRepertory();
			bookPrice = list.get(i).getBookPrice();
			bookPress = list.get(i).getBookPress();
			bookAddres = list.get(i).getBookAddres();
			bookTime = list.get(i).getBookTime();
		}

		BmOrder bmOrder = new BmOrder(null, loginName, newbooktime, isbm,
				bookName, bookAuthor, bookRepertory, bookPrice, bookTime,
				bookPress, bookAddres, bookState);
		System.out.println("遍历的结果" + bmOrder);
		int i = shopBmBookService.addShopBook(bmOrder);
		if (i != 0) {
			System.out.println("结束");
			return "childBook";
		} else {

			return "error";
		}

	}

	public String bmitBook() throws Exception {
		System.out.println("开始");
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();

		String loginName = (String) session.getAttribute("loginname");
		System.out.println(">>>>" + loginName);
		Integer bookid = bmItBook.getBookId();
		System.out.println("123" + bookid);
		List<BmItBook> list = shopBmBookService.getBmItBook(bookid);
		Date newbooktime = new Date();// 订单时间
		String isbm = "";// 图书编号
		String bookName = "";// 图书名称
		String bookAuthor = "";// 图书作者
		Integer bookRepertory = 0;// 图书数量
		BigDecimal bookPrice = new BigDecimal(0);// 图书价钱
		String bookPress = "";// 图书出版社
		String bookAddres = "";// 图书地址
		Integer bookState = 1;
		Date bookTime = new Date();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("123");
			isbm = list.get(i).getBookIsbn();
			bookName = list.get(i).getBookName();
			bookAuthor = list.get(i).getBookAuthor();
			bookRepertory = list.get(i).getBookRepertory();
			bookPrice = list.get(i).getBookPrice();
			bookPress = list.get(i).getBookPress();
			bookAddres = list.get(i).getBookAddres();
			bookTime = list.get(i).getBookTime();
		}

		BmOrder bmOrder = new BmOrder(null, loginName, newbooktime, isbm,
				bookName, bookAuthor, bookRepertory, bookPrice, bookTime,
				bookPress, bookAddres, bookState);
		System.out.println("遍历的结果" + bmOrder);
		int i = shopBmBookService.addShopBook(bmOrder);
		if (i != 0) {
			System.out.println("结束");
			return "bmitBook";
		} else {

			return "error";
		}

	}

	/**
	 * 
	 * @Title: delBook
	 * @Description:删除购物车数据
	 * @param @return 参数说明
	 * @return String 返回类型
	 * @throws
	 */
	public String delBook() {
		Integer id = bmOrder.getId();
		System.out.println("正在进行删除：" + id);
		shopBmBookService.delShopBook(id);
		return "delBook";
	}

	public BmOrder getBmOrder() {
		return bmOrder;
	}

	public void setBmOrder(BmOrder bmOrder) {
		this.bmOrder = bmOrder;
	}

	public BmLiteraryBook getBmLiteraryBook() {
		return bmLiteraryBook;
	}

	public void setBmLiteraryBook(BmLiteraryBook bmLiteraryBook) {
		this.bmLiteraryBook = bmLiteraryBook;
	}

	public BmChildBook getBmChildBook() {
		return bmChildBook;
	}

	public void setBmChildBook(BmChildBook bmChildBook) {
		this.bmChildBook = bmChildBook;
	}

	public BmItBook getBmItBook() {
		return bmItBook;
	}

	public void setBmItBook(BmItBook bmItBook) {
		this.bmItBook = bmItBook;
	}

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

}
