package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmChildBookDao;
import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.service.BmChildBookService;

@Service
@Transactional
public class BmChildBookServiceImpl implements BmChildBookService {
	@Autowired
	private BmChildBookDao bmChildBookDao;

	public BmChildBookDao getBmChildBookDao() {
		return bmChildBookDao;
	}

	public void setBmChildBookDao(BmChildBookDao bmChildBookDao) {
		this.bmChildBookDao = bmChildBookDao;
	}

	public int getBmChildBookCount() {
		// TODO Auto-generated method stub
		return bmChildBookDao.getBmChildBookCount();
	}

	public List<BmChildBook> getBmChildBook(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bmChildBookDao.getBmChildBook(currpage, allcout);
	}

	public Integer addBmChildBook(BmChildBook bmbook) {
		// TODO Auto-generated method stub
		return bmChildBookDao.addBmChildBook(bmbook);
	}

	public Integer updateBmChildBook(BmChildBook bmbook) {
		// TODO Auto-generated method stub
		return bmChildBookDao.updateBmChildBook(bmbook);
	}

	public void deleteBmChildBook(Integer bookid) {
		// TODO Auto-generated method stub
		bmChildBookDao.deleteBmChildBook(bookid);
	}

	public List<BmChildBook> getBmChildBook(Integer bookid) {
		// TODO Auto-generated method stub
		return bmChildBookDao.getBmChildBook(bookid);
	}

	@Override
	public List<BmChildBook> getBmChildBook() {
		// TODO Auto-generated method stub
		return bmChildBookDao.getBmChildBook();
	}

}
