package com.zheng.springboot.web;

/**
 * Created by Administrator on 2017/12/12.
 */
public class LanhanMan {
    //设置静态变量
    private static LanhanMan lanhanMan =null;
    //设置私有的构造函数
    private LanhanMan(){
        System.out.println("-->懒汉式单例模式开始调用构造函数");
    }

    //开放一个共有方法，判断是否已经存在实例，有返回，没有新建一个

    public static LanhanMan getLanhan(){
     System.out.print("-->懒汉式单例模式开始调用公有方法返回实例");
     if(lanhanMan==null){
         System.out.println("-->懒汉式构造函数的实例当前并没有被创建");
          lanhanMan =new LanhanMan();
     }else{
         System.out.println("-->懒汉式构造函数的实例已被创建");
     }
        System.out.println("-->方法调用结束，返回单例");
     return lanhanMan;
    }
}
