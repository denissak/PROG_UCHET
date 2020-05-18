package com.example.demo.controller;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/index")
public class DeviceController {


/*@Autowired
    private ComputerDAOService computerDAOService;*/

@Autowired
private DeviceRepository deviceRepository;


    /*@GetMapping
    public String getHtml(Model model)
    {
        model.addAttribute("devices", computerDAOService.getAllComputer());
        return null;
    }*/
    @GetMapping
    public List<Device> getAllDevice()
    {
        return deviceRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void setPostDevice(@Valid @RequestBody Device device)
    {
        deviceRepository.save(device);
    }
}
