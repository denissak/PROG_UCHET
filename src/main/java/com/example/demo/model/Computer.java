package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_computer")
    private Integer id;
    @Column
    @Enumerated(EnumType.STRING)
    private VarietyComputers varietyComputers;
    private String cpu;
    private String ozu;
    private String motherboard;
    private String disk;
    private String gpu;
    private String monitor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VarietyComputers getVarietyComputers() {
        return varietyComputers;
    }

    public void setVarietyComputers(VarietyComputers varietyComputers) {
        this.varietyComputers = varietyComputers;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOzu() {
        return ozu;
    }

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    /*    public Computer(VarietyComputers varietyComputers, String cpu, String ozu, String motherboard, String disk, String gpu, String monitor)
    {
        this.varietyComputers = varietyComputers;
        this.cpu = cpu;
        this.ozu = ozu;
        this.motherboard = motherboard;
        this.disk = disk;
        this.gpu = gpu;
        this.monitor = monitor;
    }
    public Computer (){}

    public VarietyComputers getVarietyComputers() {
        return varietyComputers;
    }

    public void setVarietyComputers(VarietyComputers varietyComputers) {
        this.varietyComputers = varietyComputers;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setOzu(String ozu) {
        this.ozu = ozu;
    }

    public String getOzu() {
        return ozu;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDisk() {
        return disk;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }
    public String getComputer ()
    {
        return varietyComputers.getTitle() + " " + cpu + " " + ozu + " " + motherboard + " " + disk + " " + gpu + " " + monitor;
    }*/
}
