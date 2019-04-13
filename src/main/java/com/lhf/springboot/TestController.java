package com.lhf.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@RestController
public class TestController {

	@GetMapping("/test")
	public String test() throws IOException {

//		try {
			new ObjectMapper().readValue("test", Map.class);
			//可能其他代码导致异常
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "欢迎来撩";
	}
}
