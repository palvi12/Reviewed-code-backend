package com.clinicmanagement.clinic.repository;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    @Query(value = "SELECT p FROM Patient p")
    public List<Patient> getAllUsers();

    @Query("select p From Patient p WHERE p.name=:val")
    public List<Patient> getUserByName(@Param("val") String name);

    @Query("select p From Patient p WHERE p.phone_no=:val")
    public Patient getUserByPhone_no(@Param("val") String phone_no);

    @Query("select p From Patient p WHERE p.name LIKE %:query% OR p.phone_no LIKE %:query% OR p.address LIKE %:query% ")
    public List<Patient> searchPatients(String query);


public List<Patient> findByHospitalId( int hospitalId);

    public void deleteByHospitalId(int hid);
//    boolean findByPhoneNo(String );

//    boolean existsByPhoneNumber(String phone_no);
}

