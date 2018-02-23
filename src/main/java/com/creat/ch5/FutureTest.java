package com.creat.ch5;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2018-02-22.
 */
public class FutureTest {
    private static final ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 0; i < 100; i++){
                    sum += i;
                    Thread.sleep(100);
                }
                return sum;
            }
        };
        Future<Integer> future = executorService.submit(callable);
        System.out.println(future.get());
        executorService.shutdown();
    }
}
