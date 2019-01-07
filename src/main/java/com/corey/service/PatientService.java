package com.corey.service;

import com.corey.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> findAll();

    void save(Patient patient);

    Patient findById(int id);

    void update(Patient patient);

    void delete(Patient patient);
}
