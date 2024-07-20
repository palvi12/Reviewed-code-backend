package com.clinicmanagement.clinic.controller;

import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.repository.CityRepository;
import com.clinicmanagement.clinic.service.CityService;
import com.clinicmanagement.clinic.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/contt")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CityService cityService;
    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/addCity")
    public String add(@RequestBody City city){
        cityService.saveCity(city);
        return "new city is added";
    }
    @DeleteMapping("/deleteCity/{id}")
    public String deleteCity(@PathVariable int id){
        cityService.deleteCity(id);
//        hospitalService.deleteHospital();
        return "city id is deleted";
    }

    @PutMapping("/updateCity/{id}")
    public City updateCity(@PathVariable int id,@RequestBody City city){
        return cityService.updateCity(id,city);
    }
    @GetMapping("/getAllUsersUsingJPQL")
    public List<City> getAllUsersUsingJPQL(){
        return cityService.getAllUsersUsingJPAQL();
    }
    @GetMapping("/city/{id}")
    public City getCity(@PathVariable int id){
        return cityService.getSingleCity(id);
    }
}
