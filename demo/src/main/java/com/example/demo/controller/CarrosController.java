package com.example.demo.controller;

import com.example.demo.service.CarrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarrosController {
    @Autowired
    CarrosService carrosService;

}
