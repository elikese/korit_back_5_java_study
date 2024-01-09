package com.study.ch11;

public class SamsungCompany {
    
    static String name = "삼성"; // static 선언 >> stack 메모리에 저장됨

    static void showCompanyInfo() {
        System.out.println("회사명 : " + name);
    }
}
