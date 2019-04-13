package com.lhf.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Order
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;

    private String buyName;
}
