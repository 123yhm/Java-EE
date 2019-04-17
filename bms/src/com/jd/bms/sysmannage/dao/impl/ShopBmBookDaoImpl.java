package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.ShopBmBookDao;
import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmOrder;

/**
 * 
 * @ClassName: ShopBmBookDaoImpl
 * @Description: 购物车的数据分页查询、插入、删除
 * @author 浩明
 * @date 2018年6月24日 下午5:55:13
 *
 */
@Repository("shopBmBookDao")
public class ShopBmBookDaoImpl extends MySession implements ShopBmBookDao {

	public Integer addShopBook(BmOrder bmOrder) {
		int i = 0;
		i = (int) this.getCurrentSession().save(bmOrder);
		if (i != 0) {
			return i;
		}
		return i;
	}

	public List<BmOrder> getShopBook() {
		Query q = this.getCurrentSession().createQuery("from BmOrder");
		List<BmOrder> list = null;
		list = q.list();
		if (list.size() >= 0 && list != null) {
			return list;
		}
		return list;
	}

	public void delShopBook(Integer id) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmOrder.class, id));
	}

	public List<BmOrder> getBmOrderBook(int currpage, int allcout, String name) {
		List<BmOrder> list = null;

		Query query = this.getCurrentSession()
				.createQuery("from BmOrder where name=?").setString(0, name);
		query.setFirstResult(currpage);
		query.setMaxResults(allcout);
		list = query.list();
		return list;
	}

	public int getBmOrderBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmOrder").uniqueResult()
				.toString());
		return i;
	}

	public List<BmChildBook> getBmChildBook(Integer bookid) {
		List<BmChildBook> list = null;

		String hql = "from BmChildBook where bookId=?";
		Query q = this.getCurrentSession().createQuery(hql)
				.setInteger(0, bookid);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}

	@Override
	public List<BmLiteraryBook> getBmLiteraryBook(Integer bookid) {
		List<BmLiteraryBook> list = null;

		String hql = "from BmLiteraryBook where bookId=?";
		Query q = this.getCurrentSession().createQuery(hql)
				.setInteger(0, bookid);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}

	@Override
	public List<BmItBook> getBmItBook(Integer bookid) {
		List<BmItBook> list = null;

		String hql = "from BmItBook where bookId=?";
		Query q = this.getCurrentSession().createQuery(hql)
				.setInteger(0, bookid);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		} else {
			return list = null;
		}

	}

}
