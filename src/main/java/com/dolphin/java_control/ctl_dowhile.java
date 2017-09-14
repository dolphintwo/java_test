package com.dolphin.java_control;

/**
 * author: dd  Date: 2017/9/14 16:52
 */
public class ctl_dowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        do {
            System.out.println("infinitive do while loop");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }

}
