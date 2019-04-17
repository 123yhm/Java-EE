package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmUserPersonDao;
import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.BmUserPersonService;

/**
 * 
 * @ClassName: BmUserPersonServiceImpl
 * @Description:个人信息查询、修改
 * @author 浩明
 * @date 2018年6月10日 上午9:33:00
 *
 */
@Service
@Transactional
public class BmUserPersonServiceImpl implements BmUserPersonService {
	@Autowired
	private BmUserPersonDao bmUserPersonDao;

	@Override
	public List<BmUser> getBmUser(String loginName) {
		// TODO Auto-generated method stub
		return bmUserPersonDao.getBmUser(loginName);
	}

	@Override
	public Integer updateBmUser(BmUser bmUser) {
		// TODO Auto-generated method stub
		return bmUserPersonDao.updateBmUser(bmUser);
	}

	@Override
	public Integer updateBmUserPwd(BmUser bmUser) {
		// TODO Auto-generated method stub
		return bmUserPersonDao.updateBmUserPwd(bmUser);
	}

}
