package com.crud_operation.repository;

import com.crud_operation.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientAppointmentRepository extends JpaRepository<Patient, Integer>{
}
