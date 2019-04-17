package com.jd.bms.sysmannage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.LoginDao;
import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	public Boolean getBmLogin(String loginName, String password) {
		// TODO Auto-generated method stub
		Boolean flag = loginDao.getBmLogin(loginName, password);
		System.out.println("service" + flag);
		return flag;
	}

	public Integer addEngi(BmUser bmuser) {
		// TODO Auto-generated method stub
		int i = loginDao.addEngi(bmuser);
		return i;

	}

	@Override
	public Boolean getBmAdmin(String loginName, String password) {
		Boolean flag = loginDao.getBmAdmin(loginName, password);
		System.out.println("service" + flag);
		return flag;
	}

}
