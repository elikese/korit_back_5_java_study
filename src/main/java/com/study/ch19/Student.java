package com.study.ch19;

public class Student {
    private String name;
    private String address;
    private int age;

    // allArgsConstructor
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    //static 메서드(builder)로 내부 클래스 주소리턴받음
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


    public static class StudentBuilder{
        private String name;
        private String address;
        private int age;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(name, address, age);
        }
    }
}
