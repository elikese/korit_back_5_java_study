package com.study.ch07.patient_register;

public class PatientRepository {

    void savePatientInfo(Patient patient) {
        PatientDB patientDB = new PatientDB();
        patientDB.insertPatient(patient);
    }

}
