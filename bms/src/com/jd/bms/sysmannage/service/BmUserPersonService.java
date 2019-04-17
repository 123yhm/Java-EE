package com.jd.bms.sysmannage.service;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmUser;

/**
 * 
 * @ClassName: BmUserPersonService
 * @Description: 个人信息服务接口
 * @author 浩明
 * @date 2018年6月10日 上午9:31:58
 *
 */
public interface BmUserPersonService {
	/**
	 * 
	 * @Title: getBmUser
	 * @Description:初始化个人信息
	 * @param @param loginName
	 * @param @return 参数说明
	 * @return List<BmUser> 返回类型
	 * @throws
	 */
	public List<BmUser> getBmUser(String loginName);

	/**
	 * 
	 * @Title: updateBmUser
	 * @Description: 修改个人信息
	 * @param @param bmUser
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmUser(BmUser bmUser);

	/**
	 * 
	 * @Title: updateBmUserPwd
	 * @Description: 用户密码修改
	 * @param @param bmUser
	 * @param @return 参数说明
	 * @return Integer 返回类型
	 * @throws
	 */
	public Integer updateBmUserPwd(BmUser bmUser);
}
