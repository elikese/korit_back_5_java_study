package com.study.ch19;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Member {
    private String name;
    private String phone;
}