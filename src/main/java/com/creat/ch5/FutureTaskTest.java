package com.creat.ch5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2018-02-22.
 */
public class FutureTaskTest {

    private final static FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
        public Integer call() throws Exception {
            int sum = 0;
            for(int i = 0; i < 100; i++){
                sum += i;
                Thread.sleep(100);
            }
            return sum;
        }
    });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
