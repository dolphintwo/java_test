package com.dolphin.java_base;

public class unary_operator {
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);// 10+12=22
        System.out.println(b++ + b++);// 10+11=21
        System.out.println(10 << 2);// 10*2^2=10*4=40
        System.out.println(10 << 3);// 10*2^3=10*8=80
        System.out.println(20 << 2);// 20*2^2=20*4=80
        System.out.println(15 << 4);// 15*2^4=15*16=240
        System.out.println(10 >> 2);// 10/2^2=10/4=2
        System.out.println(20 >> 2);// 20/2^2=20/4=5
        System.out.println(20 >> 3);// 20/2^3=20/8=2
        // For positive number, >> and >>> works same
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        // For nagative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
        int l = 10;
        int m = 5;
        int n = 20;
        System.out.println(l > m || l < n);// true || true = true
        System.out.println(l > m | l < n);// true | true = true
        // || vs |l
        System.out.println(l > m || l++ < n);// true || true = true
        System.out.println(l);// 10 because second condition is not checked
        System.out.println(l > m | l++ < n);// true | true = true
        System.out.println(l);// 11 because second condition is checked
    }
}
