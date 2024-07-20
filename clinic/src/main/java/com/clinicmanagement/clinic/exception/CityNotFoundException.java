package com.clinicmanagement.clinic.exception;

import com.clinicmanagement.clinic.entity.City;
import jakarta.servlet.http.PushBuilder;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(int id){
        super("City with id"+id+"not found");
    }
}




