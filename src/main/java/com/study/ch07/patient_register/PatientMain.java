package com.study.ch07.patient_register;

import java.util.Scanner;

public class PatientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientService patientService = new PatientService();

        String name = null;
        String civilnum = null;
        String address = null;
        int phonenum = 0;
        int chartnum = 0;

        System.out.println("환자이름: ");
        name = scanner.nextLine();
        if (patientService.isEmptyString(name)) {
            System.out.println("잘못 입력하셨습니다");
            return;
        }
        System.out.println("주민번호: ");
        civilnum = scanner.nextLine();
        if (patientService.isEmptyString(civilnum)) {
            System.out.println("잘못 입력하셨습니다");
            return;
        }
        System.out.println("주소: ");
        address = scanner.nextLine();
        if (patientService.isEmptyString(address)) {
            System.out.println("잘못 입력하셨습니다");
            return;
        }

        System.out.println("연락처: ");
        phonenum = scanner.nextInt();

        System.out.println("차트번호: ");
        chartnum = scanner.nextInt();

        Patient patient = new Patient(name, civilnum, address, phonenum, chartnum);
        patientService.RegisterPatientService(patient);
    }
}
