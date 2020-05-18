/*package com.example.demo.dao;

import com.example.demo.model.Computer;
import com.example.demo.model.VarietyComputers;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ComputerMapper implements RowMapper<Computer> {

    @Override
    public Computer mapRow(ResultSet resultSet, int i) throws SQLException {
        Computer computer = new Computer();
        computer.setVarietyComputers(VarietyComputers.valueOf(resultSet.getString("varietyComputers")));
        computer.setCpu(resultSet.getString("cpu"));
        computer.setOzu(resultSet.getString("ozu"));
        computer.setMotherboard(resultSet.getString("motherboard"));
        computer.setDisk(resultSet.getString("disk"));
        computer.setGpu(resultSet.getString("gpu"));
        computer.setMonitor(resultSet.getString("monitor"));
        return computer;
    }
}*/
