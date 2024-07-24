package com.clinicmanagement.clinic.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;



@AllArgsConstructor
//@Getter
//@Setter
@NoArgsConstructor
@ToString
@Entity

public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank(message = "hid is mandatory")
    @Column(name = "hid")
    private int hid;
   
    @NotBlank(message = "HName is mandatory")
    @Column(name = "hName")
    private String hName;
   
    @NotBlank(message = "HAddress is mandatory")
    @Column(name = "hAddress")
    private String hAddress;

    @Email(message = "Please provide a valid email address")
    @Column(name = "hGmail")
    private String hGmail;



    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public String gethGmail() {
        return hGmail;
    }

    public void sethGmail(String hGmail) {
        this.hGmail = hGmail;
    }

    public String gethPhoneNumber() {
        return hPhoneNumber;
    }

    public void sethPhoneNumber(String hPhoneNumber) {
        this.hPhoneNumber = hPhoneNumber;
    }

//    @Size(min=10,max=10)
//    @NotBlank(message = "HPhoneNumber is mandatory")
    @Column(name = "hPhoneNumber")
    private String hPhoneNumber;



    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "hid")
    private List<Patient> patients;




}
