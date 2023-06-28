package com.crud_operation.controller;

import com.crud_operation.entity.Patient;
import com.crud_operation.services.PatientAppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    public PatientAppointmentServices PServices;

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        return PServices.addPatient(patient);
    }
    @PostMapping("/addPatients")
    public List<Patient> addPatients(@RequestBody List<Patient> patients){
        return PServices.addPatients(patients);
    }

    @GetMapping("/getPatient/{id}")
    public Patient findPatientById(@PathVariable int id){
        return PServices.getPatientById(id);
    }
    @GetMapping("/getPatients")
    public List<Patient> getPatients(@RequestBody List<Patient> patients){
        return PServices.getPatients(patients);
    }

    @DeleteMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable int id){
        return PServices.deletePatient(id);
    }

    @PutMapping("/editPatient")
    public Patient editPatient(Patient patient){
        return PServices.editPatient(patient);
    }
}
