package com.lhf.springboot;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: IdeaTest
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class IdeaTest {

    public static void main(String[] args) {

        //"字符串".var
        String s = "liuhefei";

        Order order = new Order();

        //cast
        Object o = "廖师兄";
        String o1 = (String) o;

        //null
//		if (order == null) {
//		}
        if (order == null) {
        }
        if (order != null) {
        }

        //for
        List<Order> orderList = new ArrayList<>();
        for (Order order1 : orderList) {

        }
        for (int i = 0; i < orderList.size(); i++) {

        }

    }
}
