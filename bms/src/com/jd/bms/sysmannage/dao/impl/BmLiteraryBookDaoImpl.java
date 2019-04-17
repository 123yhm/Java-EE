package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmLiteraryBookDao;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;

@Repository("bmLiteraryBookDao")
public class BmLiteraryBookDaoImpl extends MySession implements
		BmLiteraryBookDao {

	/**
	 * 分页查询图书
	 */
	public List<BmLiteraryBook> getbmLiteraryBook(int currpage, int allcout) {

		List<BmLiteraryBook> list = null;

		Query query = this.getCurrentSession().createQuery(
				"from BmLiteraryBook");
		query.setFirstResult(currpage);
		query.setMaxResults(allcout);
		list = query.list();

		return list;

	}

	/**
	 * 查询图书数量
	 */
	public int getbmLiteraryBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmLiteraryBook")
				.uniqueResult().toString());
		return i;
	}

	public Integer addbmLiteraryBook(BmLiteraryBook bmbook) {// 添加
		int i = 0;
		i = (int) this.getCurrentSession().save(bmbook);
		return i;
	}

	public Integer updatebmLiteraryBook(BmLiteraryBook bmbook) {
		int i = 0;
		BmLiteraryBook bm = new BmLiteraryBook();
		bm = this.getCurrentSession().get(BmLiteraryBook.class,
				bmbook.getBookId());
		bm.setBookId(bmbook.getBookId());
		bm.setBookIsbn(bmbook.getBookIsbn());
		bm.setBookName(bmbook.getBookName());
		bm.setBookAuthor(bmbook.getBookAuthor());
		bm.setBookRepertory(bmbook.getBookRepertory());
		bm.setBookPrice(bmbook.getBookPrice());
		bm.setBookPress(bmbook.getBookPress());
		bm.setBookAddres(bmbook.getBookAddres());
		if (bm != null) {
			return i = 1;
		}
		return i;
	}

	public void deletebmLiteraryBook(Integer bookid) {

		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmLiteraryBook.class, bookid));

	}

	public List<BmLiteraryBook> getbmLiteraryBookId(Integer bookid) {
		Query q = this.getCurrentSession()
				.createQuery("from BmLiteraryBook where bookId=?")
				.setInteger(0, bookid);
		List<BmLiteraryBook> list = q.list();

		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}

	public List<BmLiteraryBook> getbmLiteraryBook() {
		// TODO Auto-generated method stub
		String hql = "from BmLiteraryBook";
		Query q = this.getCurrentSession().createQuery(hql);
		List<BmLiteraryBook> list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}
}
