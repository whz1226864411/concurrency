package com.creat.arithmetic;

/**
 * Created by Administrator on 2018-02-23.
 */
public class SingletonDemo2 {

    private static volatile SingletonDemo2 singletonDemo2;
    private SingletonDemo2() {

    }

    public static SingletonDemo2 newInstance(){
        if(singletonDemo2 == null){
            synchronized (singletonDemo2) {
                singletonDemo2 = new SingletonDemo2();
            }
        }
        return singletonDemo2;
    }
}
