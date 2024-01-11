package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaEx {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("bb");
        System.out.println(stringList);

        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        List<String> newList = stringList.stream().filter(문자열 -> !inputName.equals(문자열)).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(newList.get(1));
    }
}
