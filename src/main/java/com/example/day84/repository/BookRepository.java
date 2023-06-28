package com.example.day84.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.day84.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


}
