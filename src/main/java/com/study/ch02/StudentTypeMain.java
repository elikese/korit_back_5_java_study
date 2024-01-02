package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType a = new StudentType();

        a.name = "박씨";
        a.StudentYear = 1;
        a.address = "부산 금정구";
        System.out.println("이름 : " + a.name + " 학년 : " + a.StudentYear + "학년 주소 : " + a.address);

        Person p = a; // a 객체 업캐스트
        StudentType a2 = (StudentType) p; // 업캐스트했던 데이터를 다시 다운캐스트

//        Person 박화목 = new Person();
//        StudentType 박화목학생 = (StudentType) 박화목; // Person 객체 박화목은 StudentType의 메모리를 다 담을 수 업삳.

        StudentType 박화목학생 = new StudentType();
        Person 박화목 = (Person) 박화목학생; // 박화목학생 객체 업캐스트(여분의 메모리는 불활성화되어짐)
        StudentType 박화목학생2 = (StudentType) 박화목; // 업캐스트했던 박화목학생을 대입받았던 person 박화목을 다시 다운캐스트

    }
}
