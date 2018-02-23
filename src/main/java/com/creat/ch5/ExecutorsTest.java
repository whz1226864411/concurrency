package com.creat.ch5;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018-02-22.
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.schedule(new Runnable() {
            public void run() {
                System.out.println(1);
            }
        },1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println(2);
            }
        },1,1, TimeUnit.SECONDS);

    }
}
