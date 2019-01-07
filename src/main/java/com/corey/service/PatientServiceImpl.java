package com.corey.service;

import com.corey.dao.PatientDao;
import com.corey.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {


    private PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    public List<Patient> findAll() {
        return patientDao.findAll();
    }

    public void save(Patient patient) {
        patientDao.save(patient);
    }

    public Patient findById(int id) {
        return patientDao.findById(id);
    }

    public void update(Patient patient) {
        patientDao.update(patient);
    }

    public void delete(Patient patient) {
        patientDao.delete(patient);
    }
}