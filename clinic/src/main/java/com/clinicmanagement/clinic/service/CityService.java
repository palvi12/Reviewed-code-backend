package com.clinicmanagement.clinic.service;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Patient;

import java.util.List;

public interface CityService {
    public City saveCity(City city);
    void deleteCity(int id);
    City updateCity(int id,City city);



    List<City> getAllUsersUsingJPAQL();


    City getSingleCity(int id);
}
