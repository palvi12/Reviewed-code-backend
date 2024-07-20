package com.clinicmanagement.clinic.service;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Patient;

import java.util.List;

public interface PatienceService {
public Patient savePatient(Patient patient);


void deletePatient(int pid);
Patient updatePatient(int pid,Patient patient);

    List<Patient> getAllUsers();
Patient getSinglePatient(int pid);
List<Patient> searchPatients(String query);
Patient createPatient(Patient patient);
   boolean isPhoneNumberUnique(String phone_no);

    String deletePatientWithHospital(int i);

}
