package com.creat.ch3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Administrator on 2018-02-21.
 */
public class NoVisibility extends Thread{
    private static boolean ready = true;
    private static int number = 0;


    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(10);
        number = 30;
        Thread.sleep(100);
        ready = false;
    }
}
