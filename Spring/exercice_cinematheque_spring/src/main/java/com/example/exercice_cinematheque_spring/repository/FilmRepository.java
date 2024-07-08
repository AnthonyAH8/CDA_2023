package com.example.exercice_cinematheque_spring.repository;

import com.example.exercice_cinematheque_spring.entity.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {

}
