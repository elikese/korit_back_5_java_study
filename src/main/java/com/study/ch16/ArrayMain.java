package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("박화목");
        arrayService.add("박수목");
        arrayService.add("박목목");
        arrayService.add("박금목");
        System.out.println(arrayService);
        System.out.println(arrayService.indexOf("박화목"));
        arrayService.remove(0);
        System.out.println(arrayService);
        System.out.println(arrayService.get(0));
    }
}
