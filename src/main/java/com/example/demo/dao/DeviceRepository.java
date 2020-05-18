package com.example.demo.dao;

import com.example.demo.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DeviceRepository extends JpaRepository <Device, Integer>{

}
