package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmItBookDao;
import com.jd.bms.sysmannage.entity.BmItBook;

@Repository("bmItBookDao")
public class BmItBookDaoImpl extends MySession implements BmItBookDao {

	public int getBmItBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmItBook").uniqueResult()
				.toString());
		return i;
	}

	public List<BmItBook> getBmItBook(int currpage, int allcout) {
		List<BmItBook> list = null;

		Query query = this.getCurrentSession().createQuery("from BmItBook");
		query.setFirstResult(currpage);
		query.setMaxResults(allcout);
		list = query.list();

		return list;
	}

	public Integer addBmItBook(BmItBook bmbook) {
		int i = 0;
		i = (int) this.getCurrentSession().save(bmbook);
		return i;
	}

	public Integer updateBmItBook(BmItBook bmbook) {
		int i = 0;
		BmItBook bm = new BmItBook();
		bm = this.getCurrentSession().get(BmItBook.class, bmbook.getBookId());
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

	public void deleteBmItBook(Integer bookid) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmItBook.class, bookid));
	}

	public List<BmItBook> getBmItBook(Integer bookid) {
		Query q = this.getCurrentSession()
				.createQuery("from BmItBook where bookId=?")
				.setInteger(0, bookid);
		List<BmItBook> list = q.list();

		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}
	}

	@Override
	public List<BmItBook> getBmItBook() {
		Query q = this.getCurrentSession().createQuery("from BmItBook");
		List<BmItBook> list = q.list();

		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}
	}

}
