package com.clinicmanagement.clinic.service;

import com.clinicmanagement.clinic.entity.Hospital;
import com.clinicmanagement.clinic.entity.Patient;
import com.clinicmanagement.clinic.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService{
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @Override
    public void deleteHospital(int hid) {
        hospitalRepository.deleteById(hid);
//        hospitalRepository.deletePatients(hid);

    }
//    public List<Patient> searchPatients(String query) {
//        List<Patient> patients=patientRepository.searchPatients(query);
//        return patients;
//    }

//    @Override
//     public void deletePatients(int query) {
//
//
//
//
//    }

    @Override
    public Hospital updateHospital(int hid, Hospital hospital) {
        Hospital hospitalToUpdate=hospitalRepository.findById(hid).orElseThrow();
        hospitalToUpdate.setHid(hospital.getHid());
        hospitalToUpdate.sethAddress(hospital.gethAddress());
        hospitalToUpdate.sethName(hospital.gethName());
        hospitalToUpdate.sethPhoneNumber(hospital.gethPhoneNumber());
        hospitalToUpdate.sethGmail(hospital.gethGmail());

        return hospitalRepository.save(hospitalToUpdate);


    }

    @Override
    public List<Hospital> getAllHospital() {
        return hospitalRepository.getAllHospital();
    }

    @Override
    public Hospital getSingleHospital(int hid) {
        Optional<Hospital> hospital=hospitalRepository.findById(hid);
        if (hospital.isPresent()){
            return hospital.get();
        }
        throw new RuntimeException("Hospital is not found for the id"+hid);

    }
}
