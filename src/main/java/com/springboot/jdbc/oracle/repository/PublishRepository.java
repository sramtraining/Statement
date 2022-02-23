package com.springboot.jdbc.oracle.repository;

import com.springboot.jdbc.oracle.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PublishRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Author> getPublish() {
        return jdbcTemplate.query("SELECT * from author", BeanPropertyRowMapper.newInstance(Author.class));

    }
}
