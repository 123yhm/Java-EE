package com.jd.bms.sysmannage.dao;

import java.util.List;

import com.jd.bms.sysmannage.entity.BmUser;

/**
 * 
 * @ClassName: BmUserPersonDao
 * @Description: 用户个人信息接口
 * @author 浩明
 * @date 2018年6月9日 下午7:07:28
 *
 */
public interface BmUserPersonDao {
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
