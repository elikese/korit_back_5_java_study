package com.study.ch18;

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

        int number = supplier1.get();

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
        strList.forEach(str -> System.out.print("[" + str + "]"));
        System.out.println();

        //구성 :(람다식으로 변환 인터페이스 + 객체이름 = 메서드 재정의)
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        Function<Integer, Integer> fx2 = num -> num*2;

        System.out.println(fx1.apply(10));

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        String result3 = fx1.andThen(a -> {
            System.out.println("fx1작동 다음 실행");
            return a;
        }).apply(100);

        System.out.println(result2);
        System.out.println(result3);
        //Predicate -> ArrayList에서 조건에 맞는 자료들에 대해 true인것들을 보여주는 필터역할을 함
        Predicate<Integer> filterFx = num -> num % 2 == 0;

        List<Integer> numList = new ArrayList<>();
        for(int i=0; i< 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);

        //List.stream -> List의 자료를 stream 객체로 복사해서 저장 변환(반복을 위해 사용)
        //filter() -> Predicate의 인스턴스 객체를 받음. 값이 true이면 담는다.

        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        //map() -> Function의 인스턴스 객체를 받음(익명 이므로 바로 연산식을 정의하여 사용). 연산하여 담는다.
        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
