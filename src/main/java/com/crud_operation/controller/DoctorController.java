package com.crud_operation.controller;

import com.crud_operation.entity.Doctor;
import com.crud_operation.services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorServices services;

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doc){
        return services.saveDoctor(doc);
    }
    @PostMapping("/addDoctors")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> docs){
        return services.saveDoctors(docs);
    }

    @GetMapping("/getDoctors")
    public List<Doctor> findAllDoctors(@RequestBody List<Doctor> docs){
        return services.getDoctors(docs);
    }

    @GetMapping("/getDoctor/{id}")
    public Doctor findDoctorById(@PathVariable int id){
        return services.getDoctorById(id);
    }

    @PutMapping("/updateDoctor")
    public Doctor updateDoctor(@RequestBody Doctor doc){
        return services.editDoctor(doc);
    }
    @DeleteMapping("/deleteDoctor/{id}")
    public String  deleteDoctor(@PathVariable int id){
        return services.deleteDoctorById(id);
    }
}
