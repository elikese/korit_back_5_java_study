package com.study.ch07.patient_register;

public class PatientDB {

    void insertPatient(Patient patient) {
        System.out.println("DB로 전달완료");
        System.out.println("이름: " + patient.patientName);
        System.out.println("주민번호: " + patient.patientCivilNum);
        System.out.println("주소: " + patient.patientAddress);
        System.out.println("연락처: " + patient.patientPhoneNum);
        System.out.println("차트번호: " + patient.chartNumber);
    }

}
