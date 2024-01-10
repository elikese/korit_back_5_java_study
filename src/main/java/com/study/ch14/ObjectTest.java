package com.study.ch14;

import java.util.Objects;

/**
 * Object 클래스
 * 모든 클래스는 Object 클래스를 상속받고 있다 == Object 클래스는 모든 클래스의 상위 **자바의 특징
 */
public class ObjectTest {

    private final String main;
    private final String address;

    public ObjectTest(String main, String address) {
        this.main = main;
        this.address = address;
    }

    @Override
    public String toString() {
        return "toString 메소드 테스트";
    }

    @Override
    public boolean equals(Object o) {
        // 기존 equals 메소드
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // 두 클래스의 필드 멤버들 값비교 : 값이 같으면 주소가 달라도 true 리턴
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(main, that.main) && Objects.equals(address, that.address);
    }

    @Override
    // 실제 메모리 주소는 다르나, 두개의 값을 연산한 결과의 해쉬값은 동일해진다.
    // equals와는 다르게 필드 멤버들이 같으면 클래스가 달라도 동일한 결과 출력.
    public int hashCode() {
        return Objects.hash(main, address);
    }

}
