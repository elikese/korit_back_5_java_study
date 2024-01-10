package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("박화목", "금정구");
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("박화목", "금정구");

        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class); // static 접근하려면 .class로 접근 >>>> instanceof 대신 사용

        System.out.println(objectTest.hashCode()); // 실제 메모리 주소
        System.out.println(objectTest1.hashCode()); // 실제 메모리 주소
    }
}
