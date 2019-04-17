package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.ShopBmBookDao;
import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmOrder;
import com.jd.bms.sysmannage.service.ShopBmBookService;

@Service
@Transactional
public class ShopBmBookServiceImpl implements ShopBmBookService {
	@Autowired
	private ShopBmBookDao shopBmBookDao;

	public Integer addShopBook(BmOrder bmOrder) {
		// TODO Auto-generated method stub
		return shopBmBookDao.addShopBook(bmOrder);
	}

	public List<BmOrder> getShopBook() {
		// TODO Auto-generated method stub
		return shopBmBookDao.getShopBook();
	}

	public void delShopBook(Integer id) {
		shopBmBookDao.delShopBook(id);
	}

	public int getBmOrderBookCount() {
		// TODO Auto-generated method stub
		return shopBmBookDao.getBmOrderBookCount();
	}

	public List<BmOrder> getBmOrderBook(int currpage, int allcout, String name) {
		// TODO Auto-generated method stub
		return shopBmBookDao.getBmOrderBook(currpage, allcout, name);
	}

	public List<BmChildBook> getBmChildBook(Integer bookid) {
		// TODO Auto-generated method stub
		System.out.println(">>" + bookid);
		return shopBmBookDao.getBmChildBook(bookid);
	}

	public List<BmLiteraryBook> getBmLiteraryBook(Integer bookid) {
		// TODO Auto-generated method stub
		return shopBmBookDao.getBmLiteraryBook(bookid);
	}

	public List<BmItBook> getBmItBook(Integer bookid) {
		// TODO Auto-generated method stub
		return shopBmBookDao.getBmItBook(bookid);
	}

}
