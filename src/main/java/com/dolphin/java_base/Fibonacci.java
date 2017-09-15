package com.dolphin.java_base;

import java.util.concurrent.TimeUnit;

/**
 * author: dd  Date: 2017/9/15 10:13
 */
public class Fibonacci {
    public static long calc(long n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calc(n - 1) + calc(n - 2);
        }

    }

    public static void main(String[] args) {
        long n = 50;
        long begin = System.nanoTime();
        long f = Fibonacci.calc(n);
        long end = System.nanoTime();
        System.out.println("第" + n + "个斐波那契数列值是" + f + ",耗时为" + TimeUnit.NANOSECONDS.toMillis(end - begin) + "毫秒");
    }
}
