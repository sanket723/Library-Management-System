package com.backendSpring2.LibraryManagementSystem.Controller;

import com.backendSpring2.LibraryManagementSystem.Entity.Author;
import com.backendSpring2.LibraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")

public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author added successfully";
    }

    @GetMapping("/get-authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

}
