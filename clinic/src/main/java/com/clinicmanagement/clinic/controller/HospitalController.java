package com.clinicmanagement.clinic.controller;


import com.clinicmanagement.clinic.entity.Hospital;
import com.clinicmanagement.clinic.entity.Patient;
import com.clinicmanagement.clinic.repository.HospitalRepository;
import com.clinicmanagement.clinic.repository.PatientRepository;
import com.clinicmanagement.clinic.service.HospitalService;
import com.clinicmanagement.clinic.service.PatientServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/hospitals")
public class HospitalController {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Autowired

    private HospitalService hospitalService;
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientServiceImpl patientService;
    @PostMapping("/addHospital")
    public String add(@RequestBody Hospital hospital){
        hospitalService.saveHospital(hospital);
        return "New hospital is added";
    }
@Transactional
    @DeleteMapping("/deleteHospital/{hid}")
    public String deleteHospital(@PathVariable int hid){
//        Optional<Hospital> hospital=hospitalRepository.findById(hid).orElseThrow(() -> new
//                NotFoundException("Hospital not found"));
//        List<Patient> patients=hospital.get().getPatients();
//        patients.forEach(patient -> patientRepository.deleteById(patient.getPid()));


      //  hospitalService.deleteHospital(hid);
        hospitalRepository.deleteById(hid);
        patientRepository.deleteByHospitalId(hid);
        return "hospital id is deleted";

    }


    @PutMapping("/updateHospital/{hid}")
    public Hospital updateHospital(@PathVariable int hid,@RequestBody Hospital hospital){
        return hospitalService.updateHospital(hid,hospital);
    }

    @GetMapping("/getAllHospital")
    public List<Hospital> getAllHospital(){
        return hospitalService.getAllHospital();
    }
    @GetMapping("/hospital/{hid}")
    public Hospital getHospital(@PathVariable int hid) {
        return hospitalService.getSingleHospital(hid);
    }}

//    @GetMapping("/search")
//    public ResponseEntity<List<Patient>> searchPatients(@RequestParam("query") String query){
//        return ResponseEntity.ok(patienceService.searchPatients(query));
//    }


