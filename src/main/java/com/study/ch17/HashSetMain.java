package com.study.ch17;

import com.study.ch13.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {


    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("2");
        nameList.add("3");
        nameList.add("3");
        nameList.add("5");

        System.out.println("List<> : " + nameList);
        HashSet<String> names = new HashSet<>();
//        names.add("2"); // Set<>은 set, get, indexOf가 없음(순서가 없어서), 수정이 불가능 => 지우고 새로 추가 해야함
//        names.add("3"); // 순서가 없지만 Hash값이 순서가 있음
//        names.add("4");
//        names.add("5");

        names.addAll(nameList); // Set<>은 중복이 안됨, 중복제거로 이용 가능

        System.out.println("Set<> : " + names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        System.out.println(newNameList); // 중복 가능 꺼내기 가능
        newNameList.sort(new Comparator<String>() { // 순서정렬
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });
        System.out.println(newNameList);

        String findName = null;

        for (String name : names) {
            if (name.equals("사동윤")) {
                findName = name;
                break;
            }

        }

        System.out.println(findName);
    }

}