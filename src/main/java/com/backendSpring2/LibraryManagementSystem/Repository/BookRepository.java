package com.backendSpring2.LibraryManagementSystem.Repository;

import com.backendSpring2.LibraryManagementSystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
