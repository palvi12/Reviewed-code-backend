package com.clinicmanagement.clinic.service;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Hospital;
import com.clinicmanagement.clinic.entity.Patient;

import java.util.List;

public interface HospitalService {
    public Hospital saveHospital(Hospital hospital);
    void deleteHospital(int hid);
    Hospital updateHospital(int hid,Hospital hospital);
    List<Hospital> getAllHospital();
    Hospital getSingleHospital(int hid);
//    void deletePatients(int query);
}
