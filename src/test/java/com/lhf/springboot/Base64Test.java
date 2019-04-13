package com.lhf.springboot;

import java.util.Base64;

/**
 * @ClassName: Base64Test
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class Base64Test {

    public static void main(String[] args) {
        String s = "123456";
        //编码
        String encode = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encode);

        //解码
        byte[] str = Base64.getDecoder().decode(encode);
        System.out.println(new String(str));
    }
}
