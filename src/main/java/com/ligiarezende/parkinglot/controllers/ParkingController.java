package com.ligiarezende.parkinglot.controllers;

import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parking")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping
    public ResponseEntity<ParkingDTO> create(@RequestBody ParkingDTO dto) {
        dto = parkingService.create(dto);
        return ResponseEntity.ok().body(dto);
    }
}
