package com.clinicmanagement.clinic.service;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.entity.Patient;
import com.clinicmanagement.clinic.exception.CityNotFoundException;
import com.clinicmanagement.clinic.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;



    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);

    }

    @Override
    public void deleteCity(int id) {
        cityRepository.deleteById(id);

    }

    @Override
    public City updateCity(int id, City city) {
        City cityToUpdate=cityRepository.findById(id).orElseThrow(() -> new CityNotFoundException(id));
        cityToUpdate.setId(city.getId());
        cityToUpdate.setSelect_state(city.getSelect_state());
        cityToUpdate.setSelect_city(city.getSelect_city());
        return cityRepository.save(cityToUpdate);
    }

    @Override
    public List<City> getAllUsersUsingJPAQL() {
        return cityRepository.getAllUsersUsingJPAQL();
    }




    @Override
    public City getSingleCity(int id) {
        Optional<City>city=cityRepository.findById(id);
        if (city.isPresent()){
            return city.get();
        }
        throw new RuntimeException("City is not found for the id"+id);

    }
}
