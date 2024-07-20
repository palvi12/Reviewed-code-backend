package com.clinicmanagement.clinic.controller;


import com.clinicmanagement.clinic.dto.ClinicRequest;
import com.clinicmanagement.clinic.entity.City;
import com.clinicmanagement.clinic.repository.CityRepository;
import com.clinicmanagement.clinic.repository.HospitalRepository;
import com.clinicmanagement.clinic.repository.PatientRepository;
import com.clinicmanagement.clinic.service.CityService;
import com.clinicmanagement.clinic.service.HospitalService;
import com.clinicmanagement.clinic.service.PatienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/cities")
public class ClinicController {

    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatienceService patienceService;

    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private CityService cityService;




//    @PostMapping("/add")
//    public String add(@RequestBody Patient patient) {
//        patienceService.savePatient(patient);
//
////    try {
////        patienceService.savePatient((patient));
////        return  "New patient is added";
////
////    }
////    catch (Exception e){
////        return "Phone no. is already exist";
////    }}
//        return "New patient is added";
//    }
//    @PostMapping("/addHospital")
//    public String add(@RequestBody Hospital hospital){
//        hospitalService.saveHospital(hospital);
//        return "New hospital is added";
//    }
//    @PostMapping("/addCity")
//    public String add(@RequestBody City city){
//        cityService.saveCity(city);
//        return "New city is added";
//    }




    @PostMapping("/placeClinic")
    public City placeClinic(@RequestBody ClinicRequest request){
        return cityRepository.save(request.getCity());
    }
//    @GetMapping("/findAllClinics")
//    public List<City>findAllClinics(){
//        return cityRepository.findAll();
//    }
    //@GetMapping("/getInfo/{cityName}")
    //public List<ClinicResponse> getLibraryFromCity(@PathVariable String cityName){
        //return cityRepository.getPatientFromCity(cityName);

    //@GetMapping("types")
    //public List<String> getCityList(){
       // return HospitalService.


//@DeleteMapping("/delete/{pid}")
//    public String deletePatient(@PathVariable int pid){
//        patienceService.deletePatient(pid);
//        return "patient id is deleted";
//
//}
//@DeleteMapping("/deleteHospital/{hid}")
//public String deleteHospital(@PathVariable int hid){
//        hospitalService.deleteHospital(hid);
//        return "Hospital id is deleted";
//}
//@DeleteMapping("/deleteCity/{id}")
//public String deleteCity(@PathVariable int id){
//        cityService.deleteCity(id);
//        return "City id is deleted";
//}


//@PutMapping("/update/{pid}")
//    public Patient updatePatient(@PathVariable int pid,@RequestBody Patient patient) {
//
//      return patienceService.updatePatient(pid,patient);
//
//
//
//}
//@PutMapping("/updateHospital/{hid}")
//    public Hospital updateHospital(@PathVariable int hid,@RequestBody Hospital hospital){
//        return hospitalService.updateHospital(hid,hospital);
//}
//@PutMapping("/updateCity/{id}")
//    public City updateCity(@PathVariable int id,@RequestBody City city){
//        return cityService.updateCity(id,city);
//}
//
//@GetMapping("/getAllUsersUsingJPAQL")
//    public List<City> getAllUsersUsingJPAQL(){
//        return cityService.getAllUsersUsingJPAQL();
//}
//@GetMapping("/getAllUsers")
//    public List<Patient> getAllUsers(){
//        return patienceService.getAllUsers();
//}
//@GetMapping("/getAllHospital")
//    public List<Hospital> getAllHospital(){
//        return hospitalService.getAllHospital();
//}
//@GetMapping("/getCityByCityUsingJPQL/{city}")
//    public List<City> getCityByCityUsingJPQL(@PathVariable String city){
//        return cityService.getCityByCityUsingJPQL(city);
//}






//    @GetMapping("/patients/{pid}")
//    public Patient getPatient(@PathVariable int pid){
//        return patienceService.getSinglePatient(pid);
//    }
//    @GetMapping("/city/{id}")
//    public City getCity(@PathVariable int id){
//        return cityService.getSingleCity(id);
//    }
//    @GetMapping("/hospital/{hid}")
//    public Hospital getHospital(@PathVariable int hid){
//        return hospitalService.getSingleHospital(hid);
//    }
//    @GetMapping("/userByName/{name}")
//    public List<Patient> getUserByName(@PathVariable String name){
//        return patientRepository.getUserByName(name);
//    }

//    @GetMapping("/cityByName/{city_name}")
//    public List<City> getCityByName(@PathVariable String city_name){
//        return cityRepository.getCityByName(city_name);
//    }

    @GetMapping("/userByPhone_no/{phone_no}")
    public String getUserByPhone_no(@PathVariable String phone_no){
        if(!patienceService.isPhoneNumberUnique((phone_no))){
            return "Phone number already exists.";
        }
        return "Phone number does not exist";}



//    @PostMapping
//    public Patient<String>

//   @GetMapping("/search")
//    public ResponseEntity<List<Patient>> searchPatients(@RequestParam("query") String query){
//        return ResponseEntity.ok(patienceService.searchPatients(query));
//    }
//
//    @PostMapping
//    public Patient createPatient(@RequestBody Patient patient){
//        return patienceService.createPatient(patient);
//    }
}

