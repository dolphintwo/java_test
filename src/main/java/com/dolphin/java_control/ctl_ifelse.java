package com.dolphin.java_control;

/**
 * author: dd  Date: 2017/9/14 16:42
 */
public class ctl_ifelse {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是个偶数");
            } else {
                System.out.println(i + "是个奇数");
            }
        }
    }
}
