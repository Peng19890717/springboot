package com.zheng.springboot.web;

/**
 * Created by Administrator on 2017/12/12.
 */
public class EhanMan {
    //设置静态变量，直接创建实例
    private static EhanMan ehanMan=new EhanMan();
    private EhanMan(){
        //私有化构造函数
        System.out.println("-->饿汉式单例模式开始调用构造函数");
    }

    //开放一个公有方法，

    public static EhanMan getInstance(){
        return ehanMan;
    }
}
