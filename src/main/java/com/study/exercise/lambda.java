package com.study.exercise;

import java.util.function.Function;
import java.util.function.Predicate;

public class lambda {
    public static void main(String[] args) {
        Function<Integer, Integer> fx1 = number -> 10 + number;
        System.out.println(fx1.andThen(fx1의결과타입 -> fx1의결과타입 + "일까요?").apply(10));

        Predicate<Integer> isBigThan10 = num -> num > 10;
        System.out.println(isBigThan10.test(8));
    }
}
