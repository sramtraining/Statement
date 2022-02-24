package com.springboot.jdbc.oracle.controller;

import com.springboot.jdbc.oracle.model.Publish;
import com.springboot.jdbc.oracle.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/publish")
public class PublishController {
    @Autowired
    PublishRepository publishRepository;

    @GetMapping("/getPublish")
    public ResponseEntity<List<Publish>> getAllPublish() {
        return new ResponseEntity<>(publishRepository.getPublish(), HttpStatus.OK);
    }
}
