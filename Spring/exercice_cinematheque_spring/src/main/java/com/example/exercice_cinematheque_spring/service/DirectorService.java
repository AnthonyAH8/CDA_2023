package com.example.exercice_cinematheque_spring.service;

import com.example.exercice_cinematheque_spring.entity.Director;
import com.example.exercice_cinematheque_spring.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> getAllDirectors() {
        return (List<Director>) directorRepository.findAll();
    }

    public Director getDirectorById(int id) {
        return directorRepository.findById(Long.valueOf(id)).orElse(null);
    }


}
