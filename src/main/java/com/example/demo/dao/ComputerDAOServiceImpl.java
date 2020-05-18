/*
package com.example.demo.dao;

import com.example.demo.model.Computer;
import com.example.demo.model.Device;
import com.example.demo.model.VarietyComputers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerDAOServiceImpl implements ComputerDAOService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Device> getAllComputer() {
        String sqlQuery = "Select * FROM computer";
        RowMapper<Computer> rowMapper = new ComputerMapper();
        return jdbcTemplate.query(sqlQuery, rowMapper);


    }
}
*/
