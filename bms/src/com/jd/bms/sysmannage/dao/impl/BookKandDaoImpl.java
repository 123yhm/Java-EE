package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BookKandDao;
import com.jd.bms.sysmannage.entity.BmKind;

/**
 * 
 * @ClassName: BookKandDaoImpl
 * @Description: 图书种类的分页、添加、删除、查询
 * @author 浩明
 * @date 2018年6月5日 下午9:58:00
 *
 */
@Repository("bookKandDao")
public class BookKandDaoImpl extends MySession implements BookKandDao {

	public List<BmKind> getBmKindBook(int currpage, int allcout) {
		List<BmKind> list = null;
		Query q = this.getCurrentSession().createQuery("from BmKind");
		q.setFirstResult(currpage);
		q.setMaxResults(allcout);
		list = q.list();
		return list;
	}

	public int getBmKindBookCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmKind").uniqueResult()
				.toString());
		return i;
	}

	public Integer addBmKing(BmKind bmKind) {
		int i = 0;
		i = (int) this.getCurrentSession().save(bmKind);
		return i;
	}

	public void deleteking(Integer kindid) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmKind.class, kindid));

	}

}
