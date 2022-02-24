package com.springboot.jdbc.oracle.repository;

import com.springboot.jdbc.oracle.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Author> getAuthors() {
        return jdbcTemplate.query("SELECT * from author", BeanPropertyRowMapper.newInstance(Author.class));

    }

}