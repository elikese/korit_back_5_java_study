package com.study.ch13;

/**
 * company 클래스를 싱글톤을 적용하여 구현하시오
 * 1. 유일객체 하나만 만들어야 할 때 사용
 * 2. 기능적인 서비스 클래스 하나를 돌려쓸때
 */

public class Company {
    private static Company instance; // ----1번
    private String name;

    private Company() { // ----2번

    }

    public static Company getInstance() { // ----3번
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
