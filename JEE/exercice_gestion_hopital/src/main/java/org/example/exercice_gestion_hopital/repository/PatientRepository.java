package org.example.exercice_gestion_hopital.repository;

import org.example.exercice_gestion_hopital.model.Patient;
import org.hibernate.Transaction;

import java.util.List;

public class PatientRepository extends BaseRepository<Patient> {
    public PatientRepository() {
        super();
    }

    @Override
    public Patient add(Patient entity) {
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception exception) {
            if (transaction != null) {
                transaction.rollback();
            }
            exception.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }

    @Override
    public Patient findById(int id) {
        Patient patient = null;
        try {
            session = sessionFactory.openSession();
            patient = session.get(Patient.class, id);
            if (patient == null) {
                throw new RuntimeException();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            session.close();
        }
        return patient;
    }

    @Override
    public Patient update(Patient entity) {
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }catch (Exception exception){
            if(transaction != null){
                transaction.rollback();
            }
            exception.printStackTrace();
        }finally {
            session.close();
        }

        return entity;

    }

    @Override
    public boolean delete(Patient entity) {
        Transaction transaction = null;
        boolean result = false;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
            exception.printStackTrace();
        }finally {
            session.close();
        }
        return result;
    }

    public Patient findByName(String lastname){
        Patient patient = null;
        try {
            session = sessionFactory.openSession();
        patient = (Patient) session.createQuery("FROM Patient WHERE lastname = :lastname")
                .setParameter("lastname", lastname)
                .uniqueResult();
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            session.close();
        }
        return patient;
    }

    public List<Patient> patientList(){
        List<Patient> patients = null;
        try {
            session = sessionFactory.openSession();
            patients = session.createQuery("FROM Patient").list();
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            session.close();
        }
        return patients;
    }
}
