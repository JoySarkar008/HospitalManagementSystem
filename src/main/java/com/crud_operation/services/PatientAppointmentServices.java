package com.crud_operation.services;

import com.crud_operation.entity.Patient;
import com.crud_operation.repository.PatientAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientAppointmentServices {
    @Autowired
    private PatientAppointmentRepository pRepository;

    public Patient addPatient(Patient patient){
        return pRepository.save(patient);
    }
    public List<Patient> addPatients(List<Patient> patients){
        return pRepository.saveAll(patients);
    }

    public Patient getPatientById(int id){
        return pRepository.findById(id).orElse(null);
    }

    public List<Patient> getPatients(List<Patient> patients){
        return pRepository.findAll();
    }

    public String deletePatient(int id){
        pRepository.deleteById(id);
        return " Patient Removed "+ id;
    }

    public Patient editPatient(Patient patient){
        Patient existingPatient = pRepository.findById(patient.getId()).orElse(null);
        existingPatient.setName(patient.getName());
        existingPatient.setAge(patient.getAge());
        existingPatient.setAddress(patient.getAddress());
        existingPatient.setAppointedDoctor(patient.getAppointedDoctor());
        return pRepository.save(existingPatient);
    }
}
