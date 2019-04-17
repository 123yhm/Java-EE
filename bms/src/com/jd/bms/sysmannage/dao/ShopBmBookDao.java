package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmChildBook;
import com.jd.bms.sysmannage.entity.BmItBook;
import com.jd.bms.sysmannage.entity.BmLiteraryBook;
import com.jd.bms.sysmannage.entity.BmOrder;

public interface ShopBmBookDao {
	/**
	 * 
	 * @Title: insetShopBook
	 * @Description: 将界面提供的商品插入个人购物车
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addShopBook(BmOrder bmOrder);

	/**
	 * 
	 * @Title: getbmLiteraryBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmLiteraryBook> 返回类型
	 * @throws
	 */
	public List<BmOrder> getBmOrderBook(int currpage, int allcout, String name);

	/**
	 * 
	 * @Title: getBmChildBook
	 * @Description: 少儿童书表、首页数据查询
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

	/**
	 * 
	 * @Title: getShopBook
	 * @Description: 查询所有数据
	 * @param @return 参数说明
	 * @return List<BmOrder> 返回类型
	 * @throws
	 */
	public List<BmOrder> getShopBook();

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 查询购物车数字记录
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
}
