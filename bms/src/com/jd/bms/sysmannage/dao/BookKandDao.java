package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmKind;

/**
 * 
 * @ClassName: BookKandDao
 * @Description: 图书种类
 * @author 浩明
 * @date 2018年6月5日 下午9:56:29
 *
 */
public interface BookKandDao {
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
	public List<BmKind> getBmKindBook(int currpage, int allcout);// 分页数据查询方法

	/**
	 * 
	 * @Title: getBmBook
	 * @Description: 图书分页、数量查询
	 * @param @return 参数说明
	 * @return List<BmBook> 返回类型
	 * @throws
	 */
	public int getBmKindBookCount();// 查询数据总量

	/**
	 * 
	 * @Title: addBmKing
	 * @Description: 添加种类
	 * @param @param bmKind
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer addBmKing(BmKind bmKind);

	/**
	 * 
	 * @Title: deleteking
	 * @Description: 删除种类
	 * @param @param kindid
	 * @param @return 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public void deleteking(Integer kindid);
}
