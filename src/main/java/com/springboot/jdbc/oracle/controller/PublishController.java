package com.springboot.jdbc.oracle.controller;
import com.springboot.jdbc.oracle.model.Publish;
import com.springboot.jdbc.oracle.model.Tutorial;
import com.springboot.jdbc.oracle.repository.PublishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publish")
public class PublishController {
    @Autowired
    PublishRepository publishRepository;

    @GetMapping("/getPublish")
    public ResponseEntity<List<Publish>> getAllPublish() {

        return new ResponseEntity(publishRepository.getPublish(), HttpStatus.OK);
    }

    @PostMapping("/Publishes")
    public ResponseEntity<String> createPublish(@RequestBody Publish publish) {
        try {
            publishRepository.save(new Publish(publish.getTitle(), publish.getTitle(), false));
            return new ResponseEntity<>("publish was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

