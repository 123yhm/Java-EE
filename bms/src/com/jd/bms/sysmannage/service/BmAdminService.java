package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmAdmin;

public interface BmAdminService {
	/**
	 * 
	 * @Title: getBmAdminLoginName
	 * @Description: 查询当前管理的信息
	 * @param @param loginname
	 * @param @return 参数说明
	 * @return List<BmAdmin> 返回类型
	 * @throws
	 */
	public List<BmAdmin> getBmAdminLoginName(String loginname);

	/**
	 * 
	 * @Title: updateBmAdmin
	 * @Description: 修改当前管理员的信息
	 * @param @param bmAdmin
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmAdmin(BmAdmin bmAdmin);
}
