package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmChildBook;

/**
 * 
 * @ClassName: BmChildBookDao
 * @Description:少年儿童表crud、分页
 * @author 浩明
 * @date 2018年5月27日 下午6:18:08
 *
 */
public interface BmChildBookDao {
	/**
	 * 
	 * @Title: getBmChildBook
	 * @Description: 获取少年儿童集合
	 * @param @return 参数说明
	 * @return List<BmChildBook> 返回类型
	 * @throws
	 */
	public List<BmChildBook> getBmChildBook();

	/**
	 * 
	 * @Title: getBmChildBookCount
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return 返回类型
	 * @throws
	 */
	public int getBmChildBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: getBmChildBook
	 * @Description: 分页
	 * @param @param currpage
	 * @param @param allcout
	 * @param @return 参数说明
	 * @return List<BmChildBook> 返回类型
	 * @throws
	 */
	public List<BmChildBook> getBmChildBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: addBmChildBook
	 * @Description: 添加
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmChildBook(BmChildBook bmbook);

	/**
	 * 
	 * @Title: updateBmChildBook
	 * @Description: 修改
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmChildBook(BmChildBook bmbook);

	/**
	 * 
	 * @Title: deleteBmChildBook
	 * @Description: 删除
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public void deleteBmChildBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmChildBook
	 * @Description: 查询单个
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmChildBook> 返回类型
	 * @throws
	 */
	public List<BmChildBook> getBmChildBook(Integer bookid);
}
