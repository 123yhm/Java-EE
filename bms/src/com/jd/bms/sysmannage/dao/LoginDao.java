package com.jd.bms.sysmannage.dao;

import com.jd.bms.sysmannage.entity.BmUser;

/**
 * 
 * @ClassName: LoginDao
 * @Description: 登录、注册接口
 * @author 浩明
 * @date 2018年5月16日 下午9:09:14
 *
 */
public interface LoginDao {
	/**
	 * 
	 * @Title: getBmLogin
	 * @Description: 用户登录
	 * @param @param loginName
	 * @param @param password
	 * @param @return 参数说明
	 * @return Boolean 返回类型
	 * @throws
	 */
	public Boolean getBmLogin(String loginName, String password);

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

	/**
	 * @return
	 * 
	 * @Title: addEngi
	 * @Description: 注册
	 * @param @param bmuser
	 * @param @return 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	public Integer addEngi(BmUser bmuser);
}
