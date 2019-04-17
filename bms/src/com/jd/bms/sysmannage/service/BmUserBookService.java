package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmUser;

public interface BmUserBookService {
	/**
	 * 
	 * @Title: getBmUser
	 * @Description: 分页
	 * @param @param currpage
	 * @param @param allcout
	 * @param @return 参数说明
	 * @return List<BmUser> 返回类型
	 * @throws
	 */
	public List<BmUser> getBmUserBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public int getBmUserBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: getBmUserBookId
	 * @Description: 图书单个信息查询
	 * @param @param userid
	 * @param @return 参数说明
	 * @return List<BmUser> 返回类型
	 * @throws
	 */
	public List<BmUser> getBmUserBookId(Integer id);

	/**
	 * 
	 * @Title: addBmUserBook
	 * @Description: 添加用户
	 * @param @param bmUser
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmUserBook(BmUser bmUser);

	/**
	 * 
	 * @Title: deleteBmUserBook
	 * @Description:删除用户
	 * @param @param id 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public void deleteBmUserBook(Integer id);

	/**
	 * 
	 * @Title: getBmUserBookName
	 * @Description: 搜索用户
	 * @param @param name
	 * @param @return 参数说明
	 * @return List<BmUser> 返回类型
	 * @throws
	 */
	public List<BmUser> getBmUserBookName(String loginName);
}
