package com.example.tp_rh_spring.service;

import com.example.tp_rh_spring.dto.candidate.CandidateDtoGet;
import com.example.tp_rh_spring.dto.candidate.CandidateDtoPost;
import com.example.tp_rh_spring.entity.Candidate;
import com.example.tp_rh_spring.repository.CandidateRepository;
import com.example.tp_rh_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidateService implements BaseService<CandidateDtoPost, CandidateDtoGet> {

    @Autowired
    private CandidateRepository candidateRepository;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public CandidateDtoGet findById(int id) {
        Optional <Candidate> candidate = candidateRepository.findById(id);
        return candidate.map(this::candidateToCandidateGet).orElse(null);

    }

    @Override
    public List<CandidateDtoGet> findAll() {
        List<Candidate> candidates = (List<Candidate>) candidateRepository.findAll();
        return candidates.stream()
                .map(this::candidateToCandidateGet)
                .collect(Collectors.toList());
    }

    @Override
    public CandidateDtoGet create(CandidateDtoPost candidateDtoPost) {
        Candidate candidate = Candidate.builder()
                .name(candidateDtoPost.getName())
                .identificationNumber(candidateDtoPost.getIdentificationNumber())
                .address(candidateDtoPost.getAddress())
                .phoneNumber(candidateDtoPost.getPhoneNumber())
                .email(candidateDtoPost.getEmail())
                .birthDate(LocalDate.parse(candidateDtoPost.getBirthDate()))
                .rating(candidateDtoPost.getRating())
                .observation(candidateDtoPost.getObservation())
                .skill(candidateDtoPost.getSkill())
                .technicalArea(candidateDtoPost.getTechnicalArea())
                .jobInterviewDate(LocalDate.parse(candidateDtoPost.getJobInterviewDate()))
                .build();
        candidateRepository.save(candidate);
        return candidateToCandidateGet(candidate);
    }

    @Override
    public CandidateDtoGet update(int id, CandidateDtoPost candidateDtoPost) {
        Optional<Candidate> candidates = candidateRepository.findById(id);
        Candidate candidate = candidates.get();
        candidate.setName(candidateDtoPost.getName());
        candidate.setIdentificationNumber(candidateDtoPost.getIdentificationNumber());
        candidate.setAddress(candidateDtoPost.getAddress());
        candidate.setPhoneNumber(candidateDtoPost.getPhoneNumber());
        candidate.setEmail(candidateDtoPost.getEmail());
        candidate.setBirthDate(LocalDate.parse(candidateDtoPost.getBirthDate()));
        candidate.setRating(candidateDtoPost.getRating());
        candidate.setObservation(candidateDtoPost.getObservation());
        candidate.setSkill(candidateDtoPost.getSkill());
        candidate.setTechnicalArea(candidateDtoPost.getTechnicalArea());
        candidate.setJobInterviewDate(LocalDate.parse(candidateDtoPost.getJobInterviewDate()));
        candidateRepository.save(candidate);
        return candidateToCandidateGet(candidate);
    }

    @Override
    public boolean delete(int id) {
        List<Candidate> candidates = (List<Candidate>) candidateRepository.findAll();
        candidateRepository.deleteById(id);
        return true;
    }

    private CandidateDtoGet candidateToCandidateGet(Candidate candidate) {
        return CandidateDtoGet.builder()
                .id(candidate.getId())
                .name(candidate.getName())
                .identificationNumber(candidate.getIdentificationNumber())
                .address(candidate.getAddress())
                .phoneNumber(candidate.getPhoneNumber())
                .email(candidate.getEmail())
                .birthDate(candidate.getBirthDate())
                .rating(candidate.getRating())
                .observation(candidate.getObservation())
                .skill(candidate.getSkill())
                .technicalArea(candidate.getTechnicalArea())
                .jobInterviewDate(candidate.getJobInterviewDate())
                .build();
    }
}
