package com.example.exercice_cinematheque_spring.repository;

import com.example.exercice_cinematheque_spring.entity.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Long> {
}
