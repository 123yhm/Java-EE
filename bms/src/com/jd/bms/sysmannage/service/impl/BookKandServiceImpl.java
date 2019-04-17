package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BookKandDao;
import com.jd.bms.sysmannage.entity.BmKind;
import com.jd.bms.sysmannage.service.BookKandService;

@Service
@Transactional
public class BookKandServiceImpl implements BookKandService {
	@Autowired
	private BookKandDao bookKandDao;

	public List<BmKind> getBmKindBook(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bookKandDao.getBmKindBook(currpage, allcout);
	}

	public int getBmKindBookCount() {
		// TODO Auto-generated method stub
		return bookKandDao.getBmKindBookCount();
	}

	@Override
	public Integer addBmKing(BmKind bmKind) {
		// TODO Auto-generated method stub
		return bookKandDao.addBmKing(bmKind);
	}

	@Override
	public void deleteking(Integer kindid) {
		// TODO Auto-generated method stub
		bookKandDao.deleteking(kindid);
	}

}
