package com.example.exercice_cinematheque_spring.service;

import com.example.exercice_cinematheque_spring.dto.FilmDtoPost;
import com.example.exercice_cinematheque_spring.entity.Film;
import com.example.exercice_cinematheque_spring.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return (List<Film>) filmRepository.findAll();
    }

    public Optional<Film> getFilmById(int id) {
        return filmRepository.findById(Long.valueOf(id));
    }

    public Film addFilm(FilmDtoPost filmDtoPost) {
        Film film = Film.builder()
                .name(filmDtoPost.getName())
                .description(filmDtoPost.getDescription())
                .releaseDate(filmDtoPost.getReleaseDate())
                .duration(filmDtoPost.getDuration())
                .genre(filmDtoPost.getGenre())
                .directors(filmDtoPost.getDirectors())
                .build();
        return filmRepository.save(film);
    }

    public Film updateFilm(int id, FilmDtoPost filmDtoPost) {
        Optional<Film> film = getFilmById(id);
        film.get().setName(filmDtoPost.getName());
        film.get().setDescription(filmDtoPost.getDescription());
        film.get().setReleaseDate(filmDtoPost.getReleaseDate());
        film.get().setDuration(filmDtoPost.getDuration());
        film.get().setGenre(filmDtoPost.getGenre());
        film.get().setDirectors(filmDtoPost.getDirectors());
        return filmRepository.save(film.get());
    }

    public boolean deleteFilm(int id) {
        Optional<Film> film = getFilmById(id);
        filmRepository.delete(film.get());
        return true;
    }
}
