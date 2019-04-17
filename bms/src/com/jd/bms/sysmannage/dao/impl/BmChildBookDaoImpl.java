package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmChildBookDao;
import com.jd.bms.sysmannage.entity.BmChildBook;

@Repository("bmChildBookDao")
public class BmChildBookDaoImpl extends MySession implements BmChildBookDao {

	public int getBmChildBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmChildBook").uniqueResult()
				.toString());
		return i;
	}

	public List<BmChildBook> getBmChildBook(int currpage, int allcout) {
		List<BmChildBook> list = null;

		Query query = this.getCurrentSession().createQuery("from BmChildBook");
		query.setFirstResult(currpage);
		query.setMaxResults(allcout);
		list = query.list();

		return list;
	}

	public Integer addBmChildBook(BmChildBook bmbook) {
		int i = 0;
		i = (int) this.getCurrentSession().save(bmbook);
		return i;
	}

	public Integer updateBmChildBook(BmChildBook bmbook) {
		int i = 0;
		BmChildBook bm = new BmChildBook();
		bm = this.getCurrentSession()
				.get(BmChildBook.class, bmbook.getBookId());
		bm.setBookId(bmbook.getBookId());
		bm.setBookIsbn(bmbook.getBookIsbn());
		bm.setBookName(bmbook.getBookName());
		bm.setBookAuthor(bmbook.getBookAuthor());
		bm.setBookRepertory(bmbook.getBookRepertory());
		bm.setBookPrice(bmbook.getBookPrice());
		bm.setBookPress(bmbook.getBookPress());
		bm.setBookAddres(bmbook.getBookAddres());
		if (bm != null) {
			i = 1;
		}
		return i;
	}

	public void deleteBmChildBook(Integer bookid) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmChildBook.class, bookid));
	}

	public List<BmChildBook> getBmChildBook(Integer bookid) {
		Query q = this.getCurrentSession()
				.createQuery("from BmChildBook where bookId=?")
				.setInteger(0, bookid);
		List<BmChildBook> list = q.list();

		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}

	@Override
	public List<BmChildBook> getBmChildBook() {
		Query q = this.getCurrentSession().createQuery("from BmChildBook");
		List<BmChildBook> list = q.list();

		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}
	}

}
