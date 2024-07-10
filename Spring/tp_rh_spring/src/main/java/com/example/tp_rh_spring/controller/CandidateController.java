package com.example.tp_rh_spring.controller;

import com.example.tp_rh_spring.dto.candidate.CandidateDtoGet;
import com.example.tp_rh_spring.dto.candidate.CandidateDtoPost;
import com.example.tp_rh_spring.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rh")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidates")
    public ResponseEntity<List<CandidateDtoGet>> getCandidates() {
        return ResponseEntity.ok(candidateService.findAll());
    }

    @GetMapping("/candidates/{id}")
    public ResponseEntity<CandidateDtoGet> getCandidateById(@PathVariable int id) {
        return ResponseEntity.ok(candidateService.findById(id));
    }

    @PostMapping("/candidates/add")
    public ResponseEntity<CandidateDtoGet> addCandidate(@Validated @RequestBody CandidateDtoPost candidateDtoPost) {
        return ResponseEntity.status(HttpStatus.CREATED).body(candidateService.create(candidateDtoPost));
    }

    @PutMapping("/candidates/update/{id}")
    public ResponseEntity<CandidateDtoGet> updateCandidate(@PathVariable int id, @Validated @RequestBody CandidateDtoPost candidateDtoPost) {
        return ResponseEntity.ok(candidateService.update(id, candidateDtoPost));
    }

    @DeleteMapping("/candidates/delete/{id}")
    public ResponseEntity<String> deleteCandidate(@PathVariable int id) {
        candidateService.delete(id);
        return ResponseEntity.ok("Candidat " + id + "supprimé");
    }
}
