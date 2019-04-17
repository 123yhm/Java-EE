package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmLeaveWordDao;
import com.jd.bms.sysmannage.entity.BmLeaveWord;

@Repository("bmLeaveWordDao")
public class BmLeaveWordDaoImpl extends MySession implements BmLeaveWordDao {

	public List<BmLeaveWord> getBmLeaveWordmessage(int currpage, int allcout) {
		List<BmLeaveWord> list = null;
		Query q = this.getCurrentSession().createQuery("from BmLeaveWord");
		q.setFirstResult(currpage);
		q.setMaxResults(allcout);
		list = q.list();
		if (list.size() > 0 && list != null) {
			return list;
		}
		return list;
	}

	public Integer addBmLeaveWordmessage(BmLeaveWord bmLeaveWord) {
		int i = 0;
		i = (int) this.getCurrentSession().save(bmLeaveWord);
		return i;
	}

	public int getBmLeaveWordmessageCount() {
		int i = 0;
		i = Integer.parseInt(this.getCurrentSession()
				.createQuery("select count(*) from BmLeaveWord").uniqueResult()
				.toString());
		return i;
	}

	@Override
	public void deletemess(Integer id) {
		this.getCurrentSession().delete(
				this.getCurrentSession().get(BmLeaveWord.class, id));

	}
}
