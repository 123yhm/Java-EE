package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmLeaveWord;

public interface BmLeaveWordService {
	/**
	 * 
	 * @Title: getBmLeaveWordmessage
	 * @Description: 查询
	 * @param @return 参数说明
	 * @return List<BmLeaveWord> 返回类型
	 * @throws
	 */
	public List<BmLeaveWord> getBmLeaveWordmessage(int currpage, int allcout);

	/**
	 * 
	 * @Title: addBmLeaveWordmessage
	 * @Description:添加
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmLeaveWordmessage(BmLeaveWord bmLeaveWord);

	/**
	 * 数量查询
	 */
	public int getBmLeaveWordmessageCount();

	/**
	 * 
	 * @Title: deletemess
	 * @Description: 删除后台留言数据
	 * @param @param id 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public void deletemess(Integer id);
}
