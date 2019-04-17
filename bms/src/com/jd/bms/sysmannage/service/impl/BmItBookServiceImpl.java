package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmItBookDao;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.service.BmItBookService;

@Service
@Transactional
public class BmItBookServiceImpl implements BmItBookService {
	@Autowired
	private BmItBookDao bmItBookDao;

	public int getBmItBookCount() {
		// TODO Auto-generated method stub
		return bmItBookDao.getBmItBookCount();
	}

	public List<BmItBook> getBmItBook(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bmItBookDao.getBmItBook(currpage, allcout);
	}

	public Integer addBmItBook(BmItBook bmbook) {
		// TODO Auto-generated method stub
		return bmItBookDao.addBmItBook(bmbook);
	}

	public Integer updateBmItBook(BmItBook bmbook) {
		// TODO Auto-generated method stub
		return bmItBookDao.updateBmItBook(bmbook);
	}

	public void deleteBmItBook(Integer bookid) {
		// TODO Auto-generated method stub
		bmItBookDao.deleteBmItBook(bookid);
	}

	public List<BmItBook> getBmItBook(Integer bookid) {
		// TODO Auto-generated method stub
		return bmItBookDao.getBmItBook(bookid);
	}

	@Override
	public List<BmItBook> getBmItBook() {
		// TODO Auto-generated method stub
		return bmItBookDao.getBmItBook();
	}

}
