package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("박화목", 33));
        students.add(new Student("박수목", 32));
        students.add(new Student("박목목", 31));
        students.add(new Student("박금목", 30));

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i); // 주소대입
            student.setAge(student.getAge() + 1);
        }

        // 향상된 for
        for (Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        Student[] studentArray = new Student[4];


        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("잼민이" + i, 8 + i);
        }


        // 향상된 for로는 배열에 값을 넣지 않는게 좋다
        int i = 0;
        for (Student student : studentArray) {
            studentArray[i] = new Student("잼민이", 8);
            i++;
        }

        for (Student student : studentArray) {
            System.out.println(student);
        }

        students.set(0, new Student("잼민이", 8)); // ArrayList의 set 함수

    }
}