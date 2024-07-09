package com.example.exercice_cinematheque_spring.controller;

import com.example.exercice_cinematheque_spring.dto.FilmDtoPost;
import com.example.exercice_cinematheque_spring.entity.Film;
import com.example.exercice_cinematheque_spring.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/filmslist")
    public ResponseEntity<List<Film>> allFilms() {
        return ResponseEntity.ok(filmService.getAllFilms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Film>> getById(@PathVariable int id) {
        return ResponseEntity.ok(filmService.getFilmById(id));
    }

    @PostMapping("/addfilm")
    public ResponseEntity<Film> addFilm(@RequestBody FilmDtoPost filmDtoPost) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmService.addFilm(filmDtoPost));
    }

    @PutMapping("/updatefilm/{id}")
    public ResponseEntity<Film> updateFilm(@PathVariable int id, @RequestBody FilmDtoPost filmDto) {
        return ResponseEntity.ok(filmService.updateFilm(id, filmDto));
    }

    @DeleteMapping("/deletefilm/{id}")
    public ResponseEntity<String> deleteFilm(@PathVariable("id") int id) {
        filmService.deleteFilm(id);
        return (ResponseEntity<String>) ResponseEntity.ok();
    }

}
