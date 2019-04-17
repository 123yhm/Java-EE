package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmLiteraryBook;

/**
 * 
 * @ClassName: BookDao
 * @Description: 文学小说表图书（crud）接口
 * @author 浩明
 * @date 2018年5月21日 下午9:38:14
 *
 */
public interface BmLiteraryBookDao {
	/**
	 * 
	 * @Title: getbmLiteraryBook
	 * @Description: 查询所有文学小说
	 * @param @return 参数说明
	 * @return List<BmLiteraryBook> 返回类型
	 * @throws
	 */
	public List<BmLiteraryBook> getbmLiteraryBook();

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public int getbmLiteraryBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 分页
	 * @param @param currpage
	 * @param @param allcout
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public List<BmLiteraryBook> getbmLiteraryBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: addBmBook
	 * @Description: 添加
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addbmLiteraryBook(BmLiteraryBook bmbook);

	/**
	 * 
	 * @Title: updateBmBook
	 * @Description: 修改
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updatebmLiteraryBook(BmLiteraryBook bmbook);

	/**
	 * 
	 * @Title: deleteBmBook
	 * @Description: 删除
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public void deletebmLiteraryBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmBookId
	 * @Description: 查询单个
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public List<BmLiteraryBook> getbmLiteraryBookId(Integer bookid);
}
