package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.BmUserPersonDao;
import com.jd.bms.sysmannage.entity.BmUser;

@Repository("bmUserPersonDao")
public class BmUserPersonDaoImpl extends MySession implements BmUserPersonDao {

	public List<BmUser> getBmUser(String loginName) {
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

	public Integer updateBmUser(BmUser bmUser) {
		int i = 0;
		BmUser bmUserperson = new BmUser();
		bmUserperson = this.getCurrentSession().get(BmUser.class,
				bmUser.getId());
		bmUserperson.setId(bmUser.getId());
		bmUserperson.setLoginName(bmUser.getLoginName());
		bmUserperson.setName(bmUser.getName());
		bmUserperson.setSerialnumber(bmUser.getSerialnumber());
		bmUserperson.setSex(bmUser.getSex());
		bmUserperson.setAge(bmUser.getAge());
		bmUserperson.setSchool(bmUser.getSchool());
		bmUserperson.setEmail(bmUser.getEmail());
		bmUserperson.setPhone(bmUser.getPhone());
		bmUserperson.setMobile(bmUser.getMobile());
		bmUserperson.setSelfhood(bmUser.getSelfhood());
		if (bmUserperson != null) {
			i = 1;
		}
		return i;
	}

	@Override
	public Integer updateBmUserPwd(BmUser bmUser) {
		int i = 0;
		BmUser bmUserperson = new BmUser();
		bmUserperson = this.getCurrentSession().get(BmUser.class,
				bmUser.getId());
		bmUserperson.setId(bmUser.getId());
		bmUserperson.setPassword(bmUser.getPassword());
		if (bmUserperson != null) {
			i = 1;
		}
		return i;
	}

}
