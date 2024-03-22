package com.excelsiortechie.formValidation.controller;

import com.excelsiortechie.formValidation.entity.GeekEmployee;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GeekEmployeeController {

    @PostMapping("/geekemployees")
    public ResponseEntity<GeekEmployee> saveEmployeeData (@Valid @RequestBody GeekEmployee geekEmployee) {
        return new ResponseEntity<GeekEmployee>(geekEmployee, HttpStatus.CREATED);
    }
}
