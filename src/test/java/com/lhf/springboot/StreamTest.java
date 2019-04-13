package com.lhf.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @ClassName: StreamTest
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class StreamTest {

    public static void main(String[] args) {
        //List<Order> 获取所有订单号，返回List<Integer>
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(12345, "刘豆豆"));
        orderList.add(new Order(56528, "我就不"));
        orderList.add(new Order(12346, "刘豆豆"));
        orderList.add(new Order(56528, "我就不1"));

        List<Integer> idList = new ArrayList<>();
        for(Order order : orderList){
            idList.add(order.getId());
        }
        System.out.println(idList);

        //stream
        List<Integer> collect = orderList.stream()
                .map(Order::getId)
                .filter(e -> !e.equals(12345))   //过滤
                .collect(Collectors.toList());
        System.out.println(collect);

        //stream  去重
        Set<Integer> collect1 = orderList.stream()
                .map(Order::getId)
                .collect(Collectors.toSet());
        System.out.println(collect1);

        //stream  排序
        List<Order> collect2 = orderList.stream().sorted((o1,o2) -> o2.getId().compareTo(o1.getId())).collect(Collectors.toList());
        System.out.println("排序后：" + collect2);
    }
}
