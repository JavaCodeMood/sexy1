package com.lhf.springboot;

import lombok.Getter;

/**
 * @ClassName: PayStatusEnum
 * @Description:  支付枚举
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Getter
public enum PayStatusEnum implements CodeEnum{

	WAIT(0, "等待支付"),
	SUCCESS(1, "支付成功"),
	;

	private Integer code;

	private String message;

	PayStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	//通过code查询状态
	public static PayStatusEnum findByCode(Integer code) {
		for (PayStatusEnum value : PayStatusEnum.values()) {
			if (code.equals(value.getCode())) {
				return value;
			}
		}

		throw new RuntimeException("通过code查不到");
	}
}
