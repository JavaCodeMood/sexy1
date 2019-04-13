package com.lhf.springboot;

import org.springframework.util.DigestUtils;

/**
 * @ClassName: Md5Test
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class Md5Test {

    public static void main(String[] args) {
        String s = "123456";

        //Spring方式
        String hex = DigestUtils.md5DigestAsHex(s.getBytes());
        System.out.println(hex);

        //非Spring
        String hex1 = org.apache.commons.codec.digest.DigestUtils.md5Hex(s);
        System.out.println(hex1);

    }
}
