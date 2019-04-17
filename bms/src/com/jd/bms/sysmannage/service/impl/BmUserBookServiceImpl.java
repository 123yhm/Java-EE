package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmUserBookDao;
import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.BmUserBookService;

@Service
@Transactional
public class BmUserBookServiceImpl implements BmUserBookService {
	@Autowired
	private BmUserBookDao bmUserBookDao;

	public List<BmUser> getBmUserBook(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bmUserBookDao.getBmUserBook(currpage, allcout);
	}

	@Override
	public int getBmUserBookCount() {
		// TODO Auto-generated method stub
		return bmUserBookDao.getBmUserBookCount();
	}

	@Override
	public List<BmUser> getBmUserBookId(Integer id) {
		// TODO Auto-generated method stub
		return bmUserBookDao.getBmUserBookId(id);
	}

	@Override
	public Integer addBmUserBook(BmUser bmUser) {
		// TODO Auto-generated method stub
		return bmUserBookDao.addBmUserBook(bmUser);
	}

	@Override
	public void deleteBmUserBook(Integer id) {
		// TODO Auto-generated method stub
		bmUserBookDao.deleteBmUserBook(id);
	}

	@Override
	public List<BmUser> getBmUserBookName(String loginName) {
		// TODO Auto-generated method stub
		return bmUserBookDao.getBmUserBookName(loginName);
	}

}
