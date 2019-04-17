package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmAdminDao;
import com.jd.bms.sysmannage.entity.BmAdmin;

@Repository("bmAdminDao")
public class BmAdminDaoImpl extends MySession implements BmAdminDao {

	@Override
	public List<BmAdmin> getBmAdminLoginName(String loginname) {
		List<BmAdmin> list = null;
		Query q = this.getCurrentSession()
				.createQuery("from BmAdmin where loginName=?")
				.setString(0, loginname);
		list = q.list();
		if (list.size() >= 0 && list != null) {
			return list;
		}
		return null;
	}

	@Override
	public Integer updateBmAdmin(BmAdmin bmAdmin) {
		int i = 0;
		BmAdmin bm = new BmAdmin();
		bm = this.getCurrentSession().get(BmAdmin.class, bmAdmin.getId());
		bm.setId(bmAdmin.getId());
		bm.setName(bmAdmin.getName());
		bm.setLoginName(bmAdmin.getLoginName());
		bm.setSerialnumber(bmAdmin.getSerialnumber());
		bm.setEmail(bmAdmin.getEmail());
		bm.setMobile(bmAdmin.getMobile());
		if (bm != null) {
			i = 1;
		}
		return i;
	}

}
