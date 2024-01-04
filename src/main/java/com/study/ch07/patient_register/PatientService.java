package com.study.ch07.patient_register;

public class PatientService {

    public boolean isEmptyString(String name) {
        if (name == null) {
            return true;
        }
        return name.isBlank();
    }

    void RegisterPatientService(Patient patient) {
        PatientRepository patientRepository = new PatientRepository();
        patientRepository.savePatientInfo(patient);
    }


}
