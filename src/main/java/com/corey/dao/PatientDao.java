package com.corey.dao;

import com.corey.entity.Patient;

import java.util.List;

public interface PatientDao {

    void save(Patient patient);

    Patient findById(int id);

    void update(Patient patient);

    void delete(Patient patient);

    List<Patient> findAll();
}
