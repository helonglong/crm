package com.hll.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list= new ArrayList<>();
         while (list.size()<10){
            int i1 = random.nextInt( 10 );
            int n=0;//开关法
            for (Integer integer : list) {
                if (integer==i1){
                    n=1;//关闭
                    break;
                }
            }

            if (n==0){//判断是否已经有数据
                list.add( i1 );
            }
             File f=new File("");

        }

        String v="\\xc4\\xe3\\xba\\xc3";
        System.out.println( v );
        v.length();
        System.out.println(list);
    }
}