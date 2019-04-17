package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmAdminDao;
import com.jd.bms.sysmannage.entity.BmAdmin;
import com.jd.bms.sysmannage.service.BmAdminService;

@Service
@Transactional
public class BmAdminServiceImpl implements BmAdminService {

	@Autowired
	private BmAdminDao bmAdminDao;

	public List<BmAdmin> getBmAdminLoginName(String loginname) {
		// TODO Auto-generated method stub
		return bmAdminDao.getBmAdminLoginName(loginname);
	}

	public Integer updateBmAdmin(BmAdmin bmAdmin) {
		// TODO Auto-generated method stub
		return bmAdminDao.updateBmAdmin(bmAdmin);
	}

}
