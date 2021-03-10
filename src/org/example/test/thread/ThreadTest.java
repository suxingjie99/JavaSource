package org.example.test.thread;

public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试");
            }
        }).run();
    }
}
