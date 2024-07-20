package com.clinicmanagement.clinic.repository;

import com.clinicmanagement.clinic.dto.ClinicResponse;
import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    //@Query("SELECT new com.clinicmanagement.clinic.dto.ClinicResponse (c.city_name, p.name) FROM City c JOIN c.patients p where c.city_name = :cityName")
   // public List<ClinicResponse> getPatientFromCity(@Param("cityName") String cityName);

    @Query(value = "SELECT c FROM City c")
    public List<City> getAllUsersUsingJPAQL();

    //@Query("SELECT c FROM City c where c.city=:u")
    //public List<City> getCityByCityUsingJPQL(@Param("u") String city);

//    @Query("select c From City c WHERE c.city_name=:val")
//    public List<City> getCityByName(@Param("val") String city_name);

}
