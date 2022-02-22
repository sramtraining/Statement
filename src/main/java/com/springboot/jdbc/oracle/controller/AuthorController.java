package com.springboot.jdbc.oracle.controller;

import com.springboot.jdbc.oracle.model.Author;
import com.springboot.jdbc.oracle.model.Tutorial;
import com.springboot.jdbc.oracle.repository.AuthorRepository;
import com.springboot.jdbc.oracle.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;
    @GetMapping("/getAuthors")
    public ResponseEntity<List<Author>> getAllAuthors() {

      return  new ResponseEntity<>(authorRepository.getAuthors(), HttpStatus.OK);
    }
}
