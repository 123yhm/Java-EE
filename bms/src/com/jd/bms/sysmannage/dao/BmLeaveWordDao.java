package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmLeaveWord;

/**
 * 
 * @ClassName: BmLeaveWordDao
 * @Description: 留言表模块
 * @author 浩明
 * @date 2018年6月9日 下午1:33:49
 *
 */
public interface BmLeaveWordDao {
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
	 * 数量查询
	 */
	public int getBmLeaveWordmessageCount();

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
	 * 
	 * @Title: deletemess
	 * @Description: 删除后台留言数据
	 * @param @param id 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public void deletemess(Integer id);
}
