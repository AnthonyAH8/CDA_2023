package org.example.exercice_gestion_hopital.service;

import org.example.exercice_gestion_hopital.model.CareSheet;
import org.example.exercice_gestion_hopital.model.Consultation;
import org.example.exercice_gestion_hopital.model.Prescription;
import org.example.exercice_gestion_hopital.repository.ConsultationRepository;

import java.util.Date;
import java.util.List;

public class ConsultationService {

    private ConsultationRepository consultationRepository = new ConsultationRepository();

    public Consultation add(Date consultationDate, String doctor, List <CareSheet> careSheets, List<Prescription> prescriptions){
        Consultation consultation = new Consultation(consultationDate, doctor, (CareSheet) careSheets, (Prescription) prescriptions);
        return consultationRepository.add(consultation);
    }

    public Consultation findById(int id){
        return consultationRepository.findById(id);
    }

    public List <Consultation> findAll(){
        return consultationRepository.findAll();
    }

    public Consultation update(int id, Date consultationDate, String doctor, List <CareSheet> careSheets, List<Prescription> prescriptions){
        Consultation consultation = consultationRepository.findById(id);
        if (consultation != null){
            consultation.setConsultationDate(consultationDate);
            consultation.setDoctor(doctor);
            return consultationRepository.update(consultation);
        }else{
            return null;
        }
    }

    public boolean delete(int id){
        Consultation consultation = consultationRepository.findById(id);
        return consultationRepository.delete(consultation);
    }
}
