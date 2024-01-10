package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//제네릭은 변수
//제네릭이 받는 변수들은 일반자료형 불가능. 참조자료형이어야 한다.
public class SendData<T> {
    private int code;
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}