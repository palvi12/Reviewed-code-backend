package com.clinicmanagement.clinic.repository;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Hospital;
import com.clinicmanagement.clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  HospitalRepository extends JpaRepository<Hospital,Integer> {

    //@Query(value = "SELECT DISTINCT cr.city FROM Hospital cr")
    //List<String> findByCity();

    @Query(value = "SELECT h FROM Hospital h")
    public List<Hospital> getAllHospital();

//    @Query("delete FROM Patient p where p.hospital_id = query")
//    public void deletePatients(int query);
}
