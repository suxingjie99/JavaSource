package org.example.test.threadlocal;

/**
 * @author su
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(Thread.currentThread().getName()+":设置线程本地变量");
                System.out.println(threadLocal.get());
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set(Thread.currentThread().getName()+":设置线程本地变量");
                System.out.println(threadLocal.get());
            }
        },"B").start();
    }
}
