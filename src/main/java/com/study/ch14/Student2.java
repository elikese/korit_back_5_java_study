package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
// @NoArgsConstructor <> RequiredArgsConstructor 양립불가

public class Student2 {
    private final String name; // final은 상수라서 한번 초기화하면 변경 불가 -> setter 사용 불가
    @NonNull // null값만 아니면되니까 초기화 후 변경가능 -> setter 사용 가능
    private String phone;
    private String address;
}
