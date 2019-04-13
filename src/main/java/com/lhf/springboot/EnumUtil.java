package com.lhf.springboot;

/**
 * @ClassName: EnumUtil
 * @Description:  枚举工具类，用于获取枚举信息的状态
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class EnumUtil {

	public static <T extends CodeEnum> T findByCode(Integer code, Class<T> tClass) {
		for (T t : tClass.getEnumConstants()) {
			if (code.equals(t.getCode())) {
				return t;
			}
		}

		throw new RuntimeException("通过code查不到");
	}
}
