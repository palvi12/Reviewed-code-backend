package com.clinicmanagement.clinic.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ClinicResponse {

    private String city_name;
    private String name;

    public ClinicResponse(String city_name, String name) {
        this.city_name = city_name;
        this.name = name;
    }

    private int state_code;
}
