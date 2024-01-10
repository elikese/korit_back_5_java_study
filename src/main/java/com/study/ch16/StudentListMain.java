package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("박화목",33));
        students.add(new Student("박수목",32));
        students.add(new Student("박목목",31));
        students.add(new Student("박금목",30));


        System.out.println(students);
        for (int i = 0; i < students.size() ; i++) {
            students.get(i).setAge(students.get(i).getAge() + 1);
        }
        System.out.println(students);

    }
}
