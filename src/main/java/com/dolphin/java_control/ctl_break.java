package com.dolphin.java_control;

/**
 * author: dd  Date: 2017/9/14 16:35
 */
public class ctl_break {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}
