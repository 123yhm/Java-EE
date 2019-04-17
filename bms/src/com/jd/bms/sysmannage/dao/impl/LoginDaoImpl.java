package com.jd.bms.sysmannage.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.jd.bms.sysmannage.dao.LoginDao;
import com.jd.bms.sysmannage.entity.BmUser;

/**
 * 
 * @ClassName: LoginDaoImpl
 * @Description: 登录接口实现类
 * @author 浩明
 * @date 2018年5月16日 下午9:09:27
 *
 */
@Repository("loginDao")
public class LoginDaoImpl extends MySession implements LoginDao {

	/**
	 * 登录验证
	 */
	public Boolean getBmLogin(String loginName, String password) {
		Boolean flag = false;
		List<BmUser> list = null;
		String hql = "from BmUser where loginName=? and password=?";
		Query q = this.getCurrentSession().createQuery(hql);
		q.setString(0, loginName);
		q.setString(1, password);
		list = q.list();

		if (list != null && list.size() > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 添加
	 */
	public Integer addEngi(BmUser bmuser) {
		// TODO Auto-generated method stub
		int i = (int) this.getCurrentSession().save(bmuser);
		return i;
	}

	@Override
	public Boolean getBmAdmin(String loginName, String password) {
		Boolean flag = false;
		List<BmUser> list = null;
		String hql = "from BmAdmin where loginName=? and password=?";
		Query q = this.getCurrentSession().createQuery(hql);
		q.setString(0, loginName);
		q.setString(1, password);
		list = q.list();

		if (list != null && list.size() > 0) {
			flag = true;
		}
		return flag;
	}
}
