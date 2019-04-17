package com.jd.bms.sysmannage.service;

import com.jd.bms.sysmannage.entity.BmUser;

public interface LoginService {
	public Boolean getBmLogin(String loginName, String password);

	/**
	 * 
	 * @Title: addEngi
	 * @Description: 注册
	 * @param @param bmuser
	 * @param @return 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public Integer addEngi(BmUser bmuser);

	/**
	 * 
	 * @Title: getBmLogin
	 * @Description: 管理员登录
	 * @param @param loginName
	 * @param @param password
	 * @param @return 参数说明
	 * @return Boolean 返回类型
	 * @throws
	 */
	public Boolean getBmAdmin(String loginName, String password);
}
