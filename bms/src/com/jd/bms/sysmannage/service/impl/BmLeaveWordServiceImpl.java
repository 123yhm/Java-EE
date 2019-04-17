package com.jd.bms.sysmannage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.bms.sysmannage.dao.BmLeaveWordDao;
import com.jd.bms.sysmannage.entity.BmLeaveWord;
import com.jd.bms.sysmannage.service.BmLeaveWordService;

@Service
@Transactional
public class BmLeaveWordServiceImpl implements BmLeaveWordService {
	@Autowired
	private BmLeaveWordDao bmLeaveWordDao;

	public List<BmLeaveWord> getBmLeaveWordmessage(int currpage, int allcout) {
		// TODO Auto-generated method stub
		return bmLeaveWordDao.getBmLeaveWordmessage(currpage, allcout);
	}

	public Integer addBmLeaveWordmessage(BmLeaveWord bmLeaveWord) {
		// TODO Auto-generated method stub
		return bmLeaveWordDao.addBmLeaveWordmessage(bmLeaveWord);
	}

	@Override
	public int getBmLeaveWordmessageCount() {
		// TODO Auto-generated method stub
		return bmLeaveWordDao.getBmLeaveWordmessageCount();
	}

	@Override
	public void deletemess(Integer id) {
		// TODO Auto-generated method stub
		bmLeaveWordDao.deletemess(id);
	}

}
