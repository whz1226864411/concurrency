package com.creat.arithmetic;

/**
 * Created by Administrator on 2018-02-23.
 */
public class SingletonDemo3 {

    private SingletonDemo3() {
    }

    private static class SingletonHolder {
        private static SingletonDemo3 singletonDemo3 = new SingletonDemo3();
    }

    public static SingletonDemo3 newInstance() {
        return SingletonHolder.singletonDemo3;
    }

}
