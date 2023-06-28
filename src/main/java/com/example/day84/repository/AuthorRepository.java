package com.example.day84.repository;

import java.util.List;
import java.util.Optional;

import com.example.day84.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    // Custom methods specific to Author entity

    // Find all authors
    List<Author> findAll();

    // Save an author
    Author save(Author author);

    //Find an author by ID
    Optional<Author> findById(Long id);
}
