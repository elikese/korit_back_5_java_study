package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "김씨";
        names[1] = "이씨";
        names[2] = "박씨";
        names[3] = "최씨";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
