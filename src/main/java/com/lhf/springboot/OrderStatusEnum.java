package com.lhf.springboot;

import lombok.Getter;

/**
 * @ClassName: OrderStatusEnum
 * @Description:  订单枚举
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Getter
public enum OrderStatusEnum implements CodeEnum{

	NEW(0, "新订单"),
	FINISHED(1, "完结"),
	CANCEL(2, "已取消"),
			;

	private Integer code;

	private String message;

	OrderStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
