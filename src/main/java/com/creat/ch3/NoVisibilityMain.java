package com.creat.ch3;

/**
 * Created by Administrator on 2018-02-21.
 */
public class NoVisibilityMain {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new NoVisibility();
            thread.start();
        }
    }
}
