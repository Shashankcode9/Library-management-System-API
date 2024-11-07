package com.projects.Library_management.Repositary;


import com.projects.Library_management.DTO.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}