package com.study.ch11;

public class FactoryMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");
//        SamsungCompany.name = "애플";
//        SamsungCompany.showCompanyInfo(); // 인스턴스를 만들지 않아도 static으로 선언된 클래스라서 생성자 없이 사용가능
    
        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println(Phone.autoCount);
    }
}