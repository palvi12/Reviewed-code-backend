package com.clinicmanagement.clinic.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Data
@Transactional
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//   @NotBlank(message = "id is mandatory")
    @Column(name = "id")
    private int id;


//    @NotBlank(message = "city_name is mandatory")
    @Column(name = "select_state")
    private String select_state;

//    @NotBlank(message = "state_code is mandatory")
    @Column(name = "select_city")
    private String select_city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSelect_state() {
        return select_state;
    }

    public void setSelect_state(String select_state) {
        this.select_state = select_state;
    }

    public String getSelect_city() {
        return select_city;
    }

    public void setSelect_city(String select_city) {
        this.select_city = select_city;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @OneToMany(targetEntity = Hospital.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "rp_pr",referencedColumnName ="id")
    private List<Hospital> hospitals;





}
