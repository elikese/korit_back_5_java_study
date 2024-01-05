package com.study.ch07.patient_register;

public class Patient {
    String patientName;
    String patientCivilNum;
    String patientAddress;
    int patientPhoneNum;
    int chartNumber;

    Patient(String name, String civilnum, String address, int PhoneNum, int RegiNum) {
        patientName = name;
        patientCivilNum = civilnum;
        patientAddress = address;
        patientPhoneNum = PhoneNum;
        chartNumber = RegiNum;
    }


}
