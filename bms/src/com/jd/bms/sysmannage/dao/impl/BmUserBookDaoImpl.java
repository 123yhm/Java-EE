package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmUserBookDao;
import com.jd.bms.sysmannage.entity.BmUser;

@Repository("bmUserBookDao")
public class BmUserBookDaoImpl extends MySession implements BmUserBookDao {

	public List<BmUser> getBmUserBook(int currpage, int allcout) {
		List<BmUser> list = null;
		Query q = this.getCurrentSession().createQuery("from BmUser");
		q.setFirstResult(currpage);
		q.setMaxResults(allcout);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		}
		return list;
	}

	public int getBmUserBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmUser").uniqueResult()
				.toString());
		return i;
	}

	public List<BmUser> getBmUserBookId(Integer id) {
		List<BmUser> list = null;
		Query q = this.getCurrentSession()
				.createQuery("from BmUser where id=?").setInteger(0, id);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		}
		return list;
	}

	public Integer addBmUserBook(BmUser bmUser) {

		int i = 0;
		i = (int) this.getCurrentSession().save(bmUser);
		return i;
	}

	@Override
	public void deleteBmUserBook(Integer id) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmUser.class, id));

	}

	@Override
	public List<BmUser> getBmUserBookName(String loginName) {
		List<BmUser> list = null;
		Query q = this.getCurrentSession()
				.createQuery("from BmUser where loginName=?")
				.setString(0, loginName);
		list = q.list();
		if (list != null && list.size() > 0) {
			return list;
		}
		return list;
	}

}
