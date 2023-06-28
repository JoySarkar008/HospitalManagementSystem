package com.crud_operation.services;

import com.crud_operation.entity.Doctor;
import com.crud_operation.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorServices {
    @Autowired
    private DoctorRepository repository;

    public Doctor saveDoctor (Doctor doc){
        return repository.save(doc);
    }

    public List<Doctor> saveDoctors(List<Doctor> docs){
       return repository.saveAll(docs);
    }


    public List<Doctor> getDoctors(List<Doctor> docs){
        return repository.findAll();
    }

    public Doctor getDoctorById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteDoctorById(int id){
        repository.deleteById(id);
        return "Product removed" +id;
    }

    public Doctor editDoctor(Doctor doc){
        Doctor existingDoctor = repository.findById(doc.getId()).orElse(null);
        existingDoctor.setName(doc.getName());
        existingDoctor.setPhone(doc.getPhone());
        existingDoctor.setEmail(doc.getEmail());
        existingDoctor.setSpecialist(doc.getSpecialist());
        return repository.save(existingDoctor);
    }
}
