package com.jd.bms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.bms.sysmannage.dao.LoginDao;
import com.jd.bms.sysmannage.entity.BmUser;
import com.jd.bms.sysmannage.service.LoginService;

/**
 * 
 * @ClassName: LoginTest
 * @Description: 登录测试类
 * @author 浩明
 * @date 2018年5月16日 下午9:10:10
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class LoginTest {
	@Autowired
	private LoginService loginservice;

	@Autowired
	private LoginDao logindao;

	/**
	 * 
	 * @Title: getLogin
	 * @Description: 登录测试
	 * @param 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	/*
	 * @Test public void getLogindao() { boolean flag = false; flag =
	 * logindao.getBmLogin("admin", "456"); if (flag == true) {
	 * System.out.println("123"); } else { System.out.println("789"); } }
	 */

	@Test
	public void getLogin() {
		boolean flag = false;
		flag = loginservice.getBmLogin("admin", "123");
		if (flag == true) {
			System.out.println("123");
		} else {
			System.out.println("789");
		}
	}

	/**
	 * 
	 * @Title: getEngiTest
	 * @Description: 注册测试
	 * @param 参数说明
	 * @return void 返回类型
	 * @throws
	 */
	@Test
	public void getEngiTest() {
		BmUser bmuser = new BmUser(null, "hm", "963", "yue", 2656, "2", 20,
				"hunanjidian", "1343876418@qq.com", "3628430", "15074803248",
				null);
		int i = loginservice.addEngi(bmuser);
		if (i != 0) {
			System.out.println("12");
		} else {
			System.out.println("kl");
		}

	}

}
