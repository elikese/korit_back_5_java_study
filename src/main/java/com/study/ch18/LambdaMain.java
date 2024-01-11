package com.study.ch18;

import com.study.ch13.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {

        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다");
            System.out.println("사실 실행 안합니다");
            System.out.println("진짜로 실행 합니다");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));

        };
        start.run();

        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);


        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };

        setName.accept("잼민이");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("파무기");
        strList.forEach(str -> System.out.println(str));

        //구성 :(람다식으로 변환 인터페이스 + 객체이름 = 메서드 재정의)
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        System.out.println(fx1.apply(10));

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        //Predicate -> ArrayList에서 조건에 맞는 자료들에 대해 true인것들을 보여주는 필터역할을 함
        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i=0; i< 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);
        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

    }
}
