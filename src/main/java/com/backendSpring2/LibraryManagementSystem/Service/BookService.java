package com.backendSpring2.LibraryManagementSystem.Service;

import com.backendSpring2.LibraryManagementSystem.Entity.Author;
import com.backendSpring2.LibraryManagementSystem.Entity.Book;
import com.backendSpring2.LibraryManagementSystem.Repository.AuthorRepository;
import com.backendSpring2.LibraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;         //not needed
    @Autowired
    AuthorRepository authorRepository;

    public void addBook(Book book) throws Exception{

        Author author;

        try{
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            throw new Exception("Author not present");
        }

        List<Book> booksWritten = author.getBooks();

        booksWritten.add(book);

        authorRepository.save(author);


    }
}
