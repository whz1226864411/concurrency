package com.creat;

/**
 * Hello world!
 *
 */
public class App implements Runnable{

    private boolean running = true;
    int i = 0;

    public void run() {
        while (running) {
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        Thread thread = new Thread(app);
        thread.start();
        Thread.sleep(10);
        app.running = false;
        Thread.sleep(100);
        System.out.println(app.i);
        System.out.println("程序停止!");
    }
}
