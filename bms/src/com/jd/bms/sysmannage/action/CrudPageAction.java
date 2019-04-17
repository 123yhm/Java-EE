package com.jd.bms.sysmannage.action;

import java.math.BigDecimal;
import java.util.Date;
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
 * @ClassName: CrudPageAction
 * @Description: crud控制层
 * @author 浩明
 * @date 2018年5月25日 下午4:32:04
 *
 */
public class CrudPageAction extends ActionSupport {
	/**
	 * @Fields serialVersionUID :
	 */
	private static final long serialVersionUID = 970483320157529478L;
	// 文学小说表
	@Autowired
	private BmLiteraryBookService bmLiteraryBookService;
	// 少年儿童表
	@Autowired
	private BmChildBookService bmChildBookService;
	// IT科技表
	@Autowired
	private BmItBookService bmItBookService;

	// 实体类
	private BmLiteraryBook bmLiteraryBook;
	private BmChildBook bmChildBook;
	private BmItBook bmItBook;

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

	public BmLiteraryBook getBmLiteraryBook() {
		return bmLiteraryBook;
	}

	public void setBmLiteraryBook(BmLiteraryBook bmLiteraryBook) {
		this.bmLiteraryBook = bmLiteraryBook;
	}

	// 根据id查询详细信息
	public String getidBook() throws Exception {// 根据id查询1
		Integer bookid = bmLiteraryBook.getBookId();
		List<BmLiteraryBook> list = bmLiteraryBookService
				.getbmLiteraryBookId(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("showbook", list);
			return "getId";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "error";
		}

	}

	public String getChildBook() throws Exception {// 根据id查询2
		Integer bookid = bmChildBook.getBookId();
		List<BmChildBook> list = bmChildBookService.getBmChildBook(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Childbook", list);
			return "getId";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "error";
		}

	}

	public String getidItBook() throws Exception {// 根据id查询3
		System.out.println("123");
		Integer bookid = bmItBook.getBookId();
		System.out.println(bookid);
		List<BmItBook> list = bmItBookService.getBmItBook(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Itbook", list);
			return "getId";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	// 跳转到指定路劲
	public String addBook() throws Exception {// 跳转到添加页面1
		ActionContext ctx = ActionContext.getContext();
		ctx.put("Literary", 1);
		return "add";
	}

	public String addChildBook() throws Exception {// 跳转到添加页面2
		ActionContext ctx = ActionContext.getContext();
		ctx.put("Child", 2);
		return "add";
	}

	public String addItBook() throws Exception {// 跳转到添加页面3
		ActionContext ctx = ActionContext.getContext();
		ctx.put("It", 3);
		return "add";
	}

	// 添加
	public String addsBook() throws Exception {// 添加1
		System.out.println("123");
		String bookIsbn = bmLiteraryBook.getBookIsbn();
		String bookName = bmLiteraryBook.getBookName();
		String bookAuthor = bmLiteraryBook.getBookAuthor();
		Integer bookrepertory = bmLiteraryBook.getBookRepertory();
		BigDecimal bookprice = bmLiteraryBook.getBookPrice();
		Date bookTime = new Date();
		System.out.println(bookTime);
		String bookPress = bmLiteraryBook.getBookPress();
		String bookaddress = bmLiteraryBook.getBookAddres();
		System.out.println(bookName);
		BmLiteraryBook book = new BmLiteraryBook(null, bookIsbn, bookName,
				bookAuthor, bookrepertory, bookprice, bookTime, bookPress,
				bookaddress);
		System.out.println("12345674894654");
		int i = bmLiteraryBookService.addbmLiteraryBook(book);
		if (i != 0) {
			return "adds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String addsChildBook() throws Exception {// 添加2
		System.out.println("123");
		String bookIsbn = bmChildBook.getBookIsbn();
		String bookName = bmChildBook.getBookName();
		String bookAuthor = bmChildBook.getBookAuthor();
		Integer bookrepertory = bmChildBook.getBookRepertory();
		BigDecimal bookprice = bmChildBook.getBookPrice();
		Date bookTime = new Date();
		System.out.println(bookTime);
		String bookPress = bmChildBook.getBookPress();
		String bookaddress = bmChildBook.getBookAddres();
		System.out.println(bookName);
		BmChildBook book = new BmChildBook(null, bookIsbn, bookName,
				bookAuthor, bookrepertory, bookprice, bookTime, bookPress,
				bookaddress);
		System.out.println("12345674894654");
		int i = bmChildBookService.addBmChildBook(book);
		if (i != 0) {
			return "Childadds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String addsItBook() throws Exception {// 添加3
		System.out.println("123");
		String bookIsbn = bmItBook.getBookIsbn();
		String bookName = bmItBook.getBookName();
		String bookAuthor = bmItBook.getBookAuthor();
		Integer bookrepertory = bmItBook.getBookRepertory();
		BigDecimal bookprice = bmItBook.getBookPrice();
		Date bookTime = new Date();
		String bookPress = bmItBook.getBookPress();
		String bookaddress = bmItBook.getBookAddres();
		BmItBook book = new BmItBook(null, bookIsbn, bookName, bookAuthor,
				bookrepertory, bookprice, bookTime, bookPress, bookaddress);
		System.out.println("12345674894654");
		int i = bmItBookService.addBmItBook(book);
		if (i != 0) {
			return "Itadds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	// 进入修改查询详细信息
	public String updateBook() throws Exception {// 显示查询需要编辑的信息1
		Integer bookid = bmLiteraryBook.getBookId();
		List<BmLiteraryBook> list = bmLiteraryBookService
				.getbmLiteraryBookId(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("updatebook", list);
			return "update";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String updateChildBook() throws Exception {// 显示查询需要编辑的信息2
		Integer bookid = bmChildBook.getBookId();
		List<BmChildBook> list = bmChildBookService.getBmChildBook(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("updateChild", list);
			return "update";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String updateItBook() throws Exception {// 显示查询需要编辑的信息3
		Integer bookid = bmItBook.getBookId();
		List<BmItBook> list = bmItBookService.getBmItBook(bookid);

		if (list != null) {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("updateIt", list);
			return "update";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	// 修改数据持久化
	public String updatesBook() throws Exception {// 修改持久化1
		Integer bookid = bmLiteraryBook.getBookId();
		String bookIsbn = bmLiteraryBook.getBookIsbn();
		String bookName = bmLiteraryBook.getBookName();
		String bookAuthor = bmLiteraryBook.getBookAuthor();
		Integer bookrepertory = bmLiteraryBook.getBookRepertory();
		BigDecimal bookprice = bmLiteraryBook.getBookPrice();
		Date bookTime = new Date();
		System.out.println(bookTime);
		String bookPress = bmLiteraryBook.getBookPress();
		String bookaddress = bmLiteraryBook.getBookAddres();
		BmLiteraryBook bmbook = new BmLiteraryBook(bookid, bookIsbn, bookName,
				bookAuthor, bookrepertory, bookprice, bookTime, bookPress,
				bookaddress);

		int i = bmLiteraryBookService.updatebmLiteraryBook(bmbook);
		if (i != 0) {
			return "adds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String updatesChildBook() throws Exception {// 修改持久化2
		Integer bookid = bmChildBook.getBookId();
		String bookIsbn = bmChildBook.getBookIsbn();
		String bookName = bmChildBook.getBookName();
		String bookAuthor = bmChildBook.getBookAuthor();
		Integer bookrepertory = bmChildBook.getBookRepertory();
		BigDecimal bookprice = bmChildBook.getBookPrice();
		Date bookTime = new Date();
		System.out.println(bookTime);
		String bookPress = bmChildBook.getBookPress();
		String bookaddress = bmChildBook.getBookAddres();
		BmChildBook bmbook = new BmChildBook(bookid, bookIsbn, bookName,
				bookAuthor, bookrepertory, bookprice, bookTime, bookPress,
				bookaddress);

		int i = bmChildBookService.updateBmChildBook(bmbook);
		if (i != 0) {
			return "Childadds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String updatesItBook() throws Exception {// 修改持久化3
		Integer bookid = bmItBook.getBookId();
		String bookIsbn = bmItBook.getBookIsbn();
		String bookName = bmItBook.getBookName();
		String bookAuthor = bmItBook.getBookAuthor();
		Integer bookrepertory = bmItBook.getBookRepertory();
		BigDecimal bookprice = bmItBook.getBookPrice();
		Date bookTime = new Date();
		System.out.println(bookTime);
		String bookPress = bmItBook.getBookPress();
		String bookaddress = bmItBook.getBookAddres();
		BmItBook bmbook = new BmItBook(bookid, bookIsbn, bookName, bookAuthor,
				bookrepertory, bookprice, bookTime, bookPress, bookaddress);

		int i = bmItBookService.updateBmItBook(bmbook);
		if (i != 0) {
			return "Itadds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	// 删除
	public String deleteBook() throws Exception {
		Integer bookid = bmLiteraryBook.getBookId();
		bmLiteraryBookService.deletebmLiteraryBook(bookid);
		return "adds";
	}

	public String deleteChildBook() throws Exception {
		Integer bookid = bmChildBook.getBookId();
		bmChildBookService.deleteBmChildBook(bookid);
		return "Childadds";
	}

	public String deleteItBook() throws Exception {
		Integer bookid = bmItBook.getBookId();
		bmItBookService.deleteBmItBook(bookid);
		return "Itadds";
	}

	/*
	 * =======================================种类类的添加、删除==========================
	 * ===========================
	 */
	// 种类表
	@Autowired
	private BookKandService bookKandService;
	private BmKind bmkind;

	public BmKind getBmkind() {
		return bmkind;
	}

	public void setBmkind(BmKind bmkind) {
		this.bmkind = bmkind;
	}

	public String bankaddBook() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		ctx.put("bankadd", 1);
		return "bankadd";
	}

	public String bankaddsBook() throws Exception {// 添加
		String kindname = bmkind.getBmBookname();
		String name = bmkind.getBmName();
		System.out.println("-------------" + name);
		Date bookTime = new Date();
		System.out.println(",,,,,,,,," + kindname);
		BmKind bmK = new BmKind(null, kindname, name, bookTime);
		System.out.println(bmK);
		int i = bookKandService.addBmKing(bmK);
		System.out.println(i);
		if (i != 0) {
			return "bankadds";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("Bookmain", "操作失败");
			return "input";
		}

	}

	public String kinddeleteBook() throws Exception {
		Integer id = bmkind.getBmId();
		System.out.println(">>>>>>>>>>>>" + id);
		bookKandService.deleteking(id);
		return "bankadds";
	}

	/*-----------------------------------------用户、添加、删除-------------------------------------------------*/
	@Autowired
	private BmUserBookService bmUserBookService;
	private BmUser bmuser;

	public BmUser getBmuser() {
		return bmuser;
	}

	public void setBmuser(BmUser bmuser) {
		this.bmuser = bmuser;
	}

	public String addUserBook() {
		ActionContext ctx = ActionContext.getContext();
		ctx.put("adduser", 1);

		return "addUser";
	}

	public String useraddBook() throws Exception {
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
		BmUser bmusers = new BmUser(null, loginname, password, name,
				serialnumber, sex, age, school, email, phone, mobile, null);
		int i = 0;
		i = bmUserBookService.addBmUserBook(bmusers);
		if (i != 0) {
			return "usermainpage";
		} else {
			ActionContext ctx = ActionContext.getContext();
			ctx.put("user_error", "操作失败");
			return "input";
		}

	}

	public String userdeleteBook() throws Exception {
		Integer id = bmuser.getId();
		bmUserBookService.deleteBmUserBook(id);
		return "usermainpage";
	}
}
