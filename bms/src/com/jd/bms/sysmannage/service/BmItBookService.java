package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmItBook;

/**
 * 
 * @ClassName: BmItBookDao
 * @Description: IT科技表
 * @author 浩明
 * @date 2018年5月29日 下午11:19:41
 *
 */
public interface BmItBookService {
	/**
	 * 
	 * @Title: getBmItBook
	 * @Description: IT科技集合
	 * @param @return 参数说明
	 * @return List<BmItBook> 返回类型
	 * @throws
	 */
	public List<BmItBook> getBmItBook();

	/**
	 * 
	 * @Title: getBmItBookCount
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return 返回类型
	 * @throws
	 */
	public int getBmItBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: getBmItBook
	 * @Description: 分页
	 * @param @param currpage
	 * @param @param allcout
	 * @param @return 参数说明
	 * @return List<BmItBook> 返回类型
	 * @throws
	 */
	public List<BmItBook> getBmItBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: addBmItBook
	 * @Description: 添加
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmItBook(BmItBook bmbook);

	/**
	 * 
	 * @Title: updateBmItBook
	 * @Description: 修改
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmItBook(BmItBook bmbook);

	/**
	 * 
	 * @Title: deleteBmItBook
	 * @Description: 删除
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public void deleteBmItBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmItBook
	 * @Description: 查询单个
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmItBook> 返回类型
	 * @throws
	 */
	public List<BmItBook> getBmItBook(Integer bookid);
}
