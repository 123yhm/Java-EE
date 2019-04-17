package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmOrder;

public interface ShopBmBookService {
	/**
	 * 
	 * @Title: insetShopBook
	 * @Description: 插入图书
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addShopBook(BmOrder bmOrder);

	/**
	 * 
	 * @Title: getbmLiteraryBook
	 * @Description: 查询所有购物车信息
	 * @param @return 参数说明
	 * @return List<BmLiteraryBook> 返回类型
	 * @throws
	 */
	public List<BmOrder> getBmOrderBook(int currpage, int allcout, String name);

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public int getBmOrderBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: delShopBook
	 * @Description:删除购物车数据
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public void delShopBook(Integer id);

	/**
	 * 
	 * @Title: getBmChildBook
	 * @Description: 首页混乱数据
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return BmOrder 返回类型
	 * @throws
	 */
	public List<BmChildBook> getBmChildBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmLiteraryBook
	 * @Description: 文学小说表的数据
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmLiteraryBook> 返回类型
	 * @throws
	 */
	public List<BmLiteraryBook> getBmLiteraryBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmItBook
	 * @Description: IT科技表
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmItBook> 返回类型
	 * @throws
	 */
	public List<BmItBook> getBmItBook(Integer bookid);
}
