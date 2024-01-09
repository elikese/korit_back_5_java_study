package com.study.ch12.b;

import com.study.ch12.a.Student;

public class BMain {
    public static void main(String[] args) {
        Student student = new Student(); // 패키지가 다르면 import 일어남
        student.test();
    }
}