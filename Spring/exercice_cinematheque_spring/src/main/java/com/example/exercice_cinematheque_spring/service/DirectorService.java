package com.example.exercice_cinematheque_spring.service;

import com.example.exercice_cinematheque_spring.dto.DirectorDtoPost;
import com.example.exercice_cinematheque_spring.entity.Director;
import com.example.exercice_cinematheque_spring.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Director addDirector(DirectorDtoPost directorDtoPost) {
        Director director = Director.builder()
                .firstname(directorDtoPost.getFirstname())
                .lastname(directorDtoPost.getLastname())
                .dateOfBirth(directorDtoPost.getDateOfBirth())
                .nationality(directorDtoPost.getNationality())
                .build();
        return directorRepository.save(director);
    }

    public Director updateDirector(int id, DirectorDtoPost directorDtoPost) {
        Optional<Director> director = Optional.ofNullable(getDirectorById(id));
        if (director.isPresent()) {
            director.get().setFirstname(directorDtoPost.getFirstname());
            director.get().setLastname(directorDtoPost.getLastname());
            director.get().setDateOfBirth(directorDtoPost.getDateOfBirth());
            director.get().setNationality(directorDtoPost.getNationality());
            return directorRepository.save(director.get());
        } else {
            throw new RuntimeException();
        }
    }

    public boolean deleteDirector(int id) {
        Optional<Director> director = Optional.ofNullable(getDirectorById(id));
        if (director.isPresent()) {
            directorRepository.delete(director.get());
        }
        return true;
    }

}
