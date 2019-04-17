package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmLiteraryBookDao;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.service.BmLiteraryBookService;

@Service
@Transactional
public class BmLiteraryBookServiceImpl implements BmLiteraryBookService {
	@Autowired
	private BmLiteraryBookDao bmLiteraryBookDao;

	public List<BmLiteraryBook> getbmLiteraryBook(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.getbmLiteraryBook(currpage, allcout);

	}

	public int getbmLiteraryBookCount() {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.getbmLiteraryBookCount();

	}

	@Override
	public Integer addbmLiteraryBook(BmLiteraryBook bmbook) {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.addbmLiteraryBook(bmbook);
	}

	@Override
	public Integer updatebmLiteraryBook(BmLiteraryBook bmbook) {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.updatebmLiteraryBook(bmbook);
	}

	@Override
	public void deletebmLiteraryBook(Integer bookid) {
		// TODO Auto-generated method stub
		bmLiteraryBookDao.deletebmLiteraryBook(bookid);
	}

	@Override
	public List<BmLiteraryBook> getbmLiteraryBookId(Integer bookid) {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.getbmLiteraryBookId(bookid);
	}

	@Override
	public List<BmLiteraryBook> getbmLiteraryBook() {
		// TODO Auto-generated method stub
		return bmLiteraryBookDao.getbmLiteraryBook();
	}

}
