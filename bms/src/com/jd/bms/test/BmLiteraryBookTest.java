package com.jd.bms.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class BmLiteraryBookTest {
	@Autowired
	private BmLiteraryBookService bookService;

	@Test
	public void selectTestBook() {// 查询书籍数量
		int list = bookService.getbmLiteraryBookCount();
		System.out.println(list);
	}

	@Test
	public void selectTestBookpage() {// 分页测试
		List<BmLiteraryBook> list = bookService.getbmLiteraryBook(1, 5);
		for (BmLiteraryBook li : list) {
			System.out.println(li);
		}
	}

	@Test
	public void selectBmbookid() {// id查询
		List<BmLiteraryBook> list = bookService.getbmLiteraryBookId(1);
		System.out.println(list);
	}

	@Test
	public void BmbookAdd() {// 添加

		BmLiteraryBook bmbook = new BmLiteraryBook(null, "s-x-s-y-z-s-h",
				"思想是生活的一种方式", "王汎森", 30, new BigDecimal(300), new Date(),
				"北京大学出版社", "北京");
		int i = bookService.addbmLiteraryBook(bmbook);
		if (i == 0) {
			System.out.println("添加失败");
		} else {
			System.out.println("添加成功");
		}
	}

	@Test
	public void BmbookDelete() {// 删除
		bookService.deletebmLiteraryBook(22);

	}

	@Test
	public void BmbookUpdate() {// 修改
		BmLiteraryBook bmbook = new BmLiteraryBook(23, "s-x", "思想是生活的一种方式",
				"王汎森", 30, new BigDecimal(300), new Date(), "北京大学出版社", "北京");

		int i = bookService.updatebmLiteraryBook(bmbook);

		if (i == 0) {
			System.out.println("修改失败");
		} else {
			System.out.println("修改成功");
		}
	}

}
