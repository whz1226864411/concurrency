package com.creat.ch5;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018-02-22.
 */
public class Contain {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<Integer, Integer>();
        concurrentHashMap.put(1, 11);
        concurrentHashMap.put(5, 51);
        concurrentHashMap.put(3, 31);
        concurrentHashMap.put(4, 41);
        concurrentHashMap.put(56, 561);
        int count = 0;
        for (Integer i : concurrentHashMap.keySet()) {
            if (count == 0) {
                concurrentHashMap.remove(1);
            }
            System.out.println(i+":"+concurrentHashMap.get(i));
            count++;
        }
        System.out.println();
        for (Integer i : concurrentHashMap.keySet()) {
            System.out.println(concurrentHashMap.get(i));
        }

    }
}
