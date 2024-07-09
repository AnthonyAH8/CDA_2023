package com.example.exercice_cinematheque_spring.controller;

import com.example.exercice_cinematheque_spring.dto.DirectorDtoPost;
import com.example.exercice_cinematheque_spring.entity.Director;
import com.example.exercice_cinematheque_spring.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/directorslist")
    public ResponseEntity <List<Director>> allDirectors() {
        return ResponseEntity.ok(directorService.getAllDirectors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Director> getDirector(@PathVariable int id) {
        return ResponseEntity.ok(directorService.getDirectorById(id));
    }

    @PostMapping("/adddirector")
    public ResponseEntity<Director> addDirector(@RequestBody DirectorDtoPost directorDtoPost) {
        return ResponseEntity.status(HttpStatus.CREATED).body(directorService.addDirector(directorDtoPost));
    }

    @PutMapping("/updatedirector/{id}")
    public ResponseEntity <Director> updateDirector(@PathVariable int id, @RequestBody DirectorDtoPost directorDtoPost) {
        return ResponseEntity.ok(directorService.updateDirector(id, directorDtoPost));
    }

    @DeleteMapping("/deletedirector/{id}")
    public ResponseEntity<Director> deleteDirector(@PathVariable int id) {
        directorService.deleteDirector(id);
        return (ResponseEntity<Director>) ResponseEntity.ok();
    }
}
