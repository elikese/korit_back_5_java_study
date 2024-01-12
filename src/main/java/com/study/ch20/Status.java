package com.study.ch20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    // 생성자의 이름을 대문자로 작명한것
    OK(200, "정상적인 요청"),
    BAD_REQUEAST(400, "비정상 적인 요청");

    private int code;
    private String statusName;

}
