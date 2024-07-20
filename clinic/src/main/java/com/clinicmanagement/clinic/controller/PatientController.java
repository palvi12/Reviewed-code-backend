package com.clinicmanagement.clinic.controller;


import com.clinicmanagement.clinic.entity.Patient;
import com.clinicmanagement.clinic.repository.PatientRepository;
import com.clinicmanagement.clinic.service.PatienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatienceService patienceService;

    @PostMapping("/add")
    public String add(@RequestBody Patient patient) {
        patienceService.savePatient(patient);

        return "New patient is added";
    }
    @DeleteMapping("/delete/{pid}")
    public String deletePatient(@PathVariable int pid){
        patienceService.deletePatient(pid);
        return "Patient id is deleted";
    }
    @PutMapping("/updatePatient/{pid}")
    public Patient updatePatient(@PathVariable int pid,@RequestBody Patient patient){
        return  patienceService.updatePatient(pid, patient);
    }

    @GetMapping("/getAllUsers")
    public List<Patient> getAllUsers(){
        return  patienceService.getAllUsers();
    }
    @GetMapping("/patients/{pid}")
    public Patient getPatient(@PathVariable int pid){
        return patienceService.getSinglePatient(pid);
    }
    @GetMapping("/userByName/{name}")
    public List<Patient> getUserByName(@PathVariable String name){
        return patientRepository.getUserByName(name);
    }
    @GetMapping("/search")
    public ResponseEntity<List<Patient>> searchPatients(@RequestParam("query") String query){
        return ResponseEntity.ok(patienceService.searchPatients(query));
    }
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patienceService.createPatient(patient);
    }
    @GetMapping("/all/{id}")
    public List<Patient> getFromHospital(@PathVariable int id){
        return patientRepository.findByHospitalId(id);
    }
}
