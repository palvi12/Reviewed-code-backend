package com.clinicmanagement.clinic.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.sql.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

//    @NotBlank(message = "pid is mandatory")
    @Column(name = "pid")
    private int pid;
//    @NotBlank
//    @NotBlank(message = "name is mandatory")
    @Column(name = "name")
    private String name;
//    @NotBlank
//    @NotBlank(message = "phone_no is mandatory")
    @Column( unique = true)
    private String phone_no;
//    @NotBlank
//    @NotBlank(message = "gender is mandatory")tud
    @Column(name = "gender")
    private String gender;
//    @NotBlank
//    @NotBlank(message = "address is mandatory")
    @Column(name = "address")
    private String address;

//    @NotBlank(message = "appointment_date is mandatory")
    @Column(name = "appointment_date")
    private Date appointment_date;

//    @NotBlank(message = "discharge_date is mandatory")
    @Column(name = "discharge_date")
    private Date discharge_date;
//    @NotBlank
//    @NotBlank(message = "hospital_id is mandatory")
    @Column(name = "hospitalId")
    private int hospitalId;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public Date getDischarge_date() {
        return discharge_date;
    }

    public void setDischarge_date(Date discharge_date) {
        this.discharge_date = discharge_date;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospital_id(int hospitalId) {
        this.hospitalId = hospitalId;
    }
}
