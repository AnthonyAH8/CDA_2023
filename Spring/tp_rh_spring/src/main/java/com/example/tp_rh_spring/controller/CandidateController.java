package com.example.tp_rh_spring.controller;

import com.example.tp_rh_spring.dto.candidate.CandidateDtoGet;
import com.example.tp_rh_spring.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    //TODO
}
