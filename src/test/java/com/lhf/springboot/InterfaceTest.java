package com.lhf.springboot;

/**
 * @ClassName: InterfaceTest
 * @Description:  获取枚举状态码对应的状态信息
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class InterfaceTest {

	public static void main(String[] args) {

		//支付中1是什么状态, 查订单状态
		//通过code查询状态
		Integer code = 1;
//		PayStatusEnum statusEnum = PayStatusEnum.findByCode(code);
//		System.out.println(statusEnum);

		PayStatusEnum statusEnum1 = EnumUtil.findByCode(code, PayStatusEnum.class);
		System.out.println(statusEnum1);

		OrderStatusEnum orderStatusEnum = EnumUtil.findByCode(code, OrderStatusEnum.class);
		System.out.println(orderStatusEnum);
	}
}
