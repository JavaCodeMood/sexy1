package com.lhf.springboot;

import org.apache.commons.io.FileUtils;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @ClassName: FileTest
 * @Description:
 * @Author: liuhefei
 * @Date: 2019/4/13
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public class FileTest {

    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\code\\SpringBoot\\sexy1\\doc\\img1");
        File file2 = new File("E:\\code\\SpringBoot\\sexy1\\doc\\img2");

        //拷贝文件内容到另一个文件
        //FileSystemUtils.copyRecursively(file1,file2);

        //查找遍历文件，找出 .jpeg结尾的图片
        String[] filter = {"jpeg"};
        Collection<File> files = FileUtils.listFiles(file1, filter, false);
        for(File fileStr : files){
            System.out.println(fileStr.getName());

        }

    }
}
