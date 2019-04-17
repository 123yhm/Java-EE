package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmChildBook;

/**
 * 
 * @ClassName: BmChildBookService
 * @Description:少年儿童服务接口
 * @author 浩明
 * @date 2018年6月9日 下午7:18:38
 *
 */
public interface BmChildBookService {
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
	 * @Title: getBmBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public int getBmChildBookCount();// 查询数据总量

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
	public List<BmChildBook> getBmChildBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: addBmBook
	 * @Description: 添加
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmChildBook(BmChildBook bmbook);

	/**
	 * 
	 * @Title: updateBmBook
	 * @Description: 修改
	 * @param @param bmbook
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmChildBook(BmChildBook bmbook);

	/**
	 * 
	 * @Title: deleteBmBook
	 * @Description: 删除
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public void deleteBmChildBook(Integer bookid);

	/**
	 * 
	 * @Title: getBmBookId
	 * @Description: 查询单个
	 * @param @param bookid
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public List<BmChildBook> getBmChildBook(Integer bookid);
}
