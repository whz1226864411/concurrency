package com.creat.arithmetic;

/**
 * Created by Administrator on 2018-02-23.
 */
public class SingletonDemo1 {

    private static SingletonDemo1 singletonDemo1 = new SingletonDemo1();
    private SingletonDemo1() {

    }

    public static SingletonDemo1 newInstance(){
        return singletonDemo1;
    }
}
