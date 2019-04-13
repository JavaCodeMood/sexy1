package com.lhf.springboot;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName: LambdasTest
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Slf4j
public class LambdasTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("没有了你");
                log.info("万杯觥筹只不过是提醒寂寞");
            }
        }).start();

        new Thread(()-> System.out.println("没有了你")).start();

        //排序
        Integer[] integers = {1,8,6,3,9,0,2,4};
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
}
