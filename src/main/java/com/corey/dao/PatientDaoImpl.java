package com.corey.dao;

import com.corey.entity.Patient;
import com.corey.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl implements PatientDao {

    public void save(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(patient);
        transaction.commit();
        session.close();
    }

    public Patient findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Patient.class, id);
    }

    public void update(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(patient);
        transaction.commit();
        session.close();
    }

    public void delete(Patient patient) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(patient);
        transaction.commit();
        session.close();
    }

    public List<Patient> findAll() {
        return (List<Patient>) HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createQuery("From com.corey.entity.Patient").list();
    }
}
