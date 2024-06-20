package org.example.exercice_gestion_hopital.service;

import org.example.exercice_gestion_hopital.model.Patient;
import org.example.exercice_gestion_hopital.repository.PatientRepository;

import java.util.Date;

public class PatientService {

    private PatientRepository patientRepository = new PatientRepository();

    public Patient signUp(String lastname, String firstname, String password, Date dateOfBirth, String profilePic) {
        Patient patient = new Patient(lastname, firstname, password, dateOfBirth, profilePic);
        Patient patientFound = patientRepository.findByName(lastname);
        if (patientFound != null) {
            return patientRepository.add(patient);
        } else {
            throw new RuntimeException();
        }
    }

    public Patient signIn(String lastname, String password) {
        Patient patientFound = patientRepository.findByName(lastname);
        if (patientFound != null) {
            if (password.equals(patientFound.getPassword())) {
                return patientFound;
            } else {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }

    public Patient findByName(String lastname) {
        Patient patientFound = patientRepository.findByName(lastname);
        if (patientFound != null) {
            return patientFound;
        } else {
            throw new RuntimeException();
        }
    }
}
