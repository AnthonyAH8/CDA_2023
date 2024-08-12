package com.example.exercice_gestion_bibliotheque.repository;

import com.example.exercice_gestion_bibliotheque.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
