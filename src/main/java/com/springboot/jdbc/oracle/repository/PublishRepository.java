package com.springboot.jdbc.oracle.repository;

import com.springboot.jdbc.oracle.model.Publish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PublishRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Publish> getPublish() {
        return jdbcTemplate.query("SELECT * from publish", BeanPropertyRowMapper.newInstance(Publish.class));
    }
}
