package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {
        // 생성자로 멤버 변수 초기화
        Car car1 = new Car("아반떼", "블랙");

        // 기본생성자 이후 세터로 멤버 변수 초기화
        Car car2 = new Car();
        car2.setModel("소나타");

        // 빌더(스태틱 메서드)로 생성
        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build();

        System.out.println(car);


        Student student = Student.builder()
                .name("잼민이")
                .build();


        System.out.println(student);
        Member member = Member.builder()
                .name("잼민이")
                .phone("0101121112")
                .build();
    }
}
