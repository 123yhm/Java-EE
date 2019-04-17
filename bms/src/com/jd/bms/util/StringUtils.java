package com.jd.bms.util;

/**
 * 对于字符串的一些处理和判断 类描述： 类名称：com.jd.jspstudy.framework.util.StringUtils 创建人：yhm
 * 创建时间：2018
 * 
 * @version V1.0
 */
public class StringUtils {

	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str) {
		return null == str || str.length() == 0 || "".equals(str)
				|| str.matches("\\s*");
	}

	/**
	 * 非空判断
	 */
	public static boolean isNotNull(String str) {
		return !isNull(str);
	}

}
