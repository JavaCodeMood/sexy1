package com.lhf.springboot;

import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: SexyExceptionHandler
 * @Description: 自定义异常
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@ControllerAdvice
public class SexyExceptionHandler {

	@ExceptionHandler(value = JsonParseException.class)
	@ResponseBody
	public String handle(JsonParseException e) {
		e.printStackTrace();
		return "json反序列化异常";
	}
}
