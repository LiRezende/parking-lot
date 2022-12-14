package com.ligiarezende.parkinglot.controllers;

import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.services.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/parking")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping
    public ResponseEntity<ParkingDTO> create(@Valid @RequestBody ParkingDTO dto) {
        dto = parkingService.create(dto);
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ParkingDTO> findById(@PathVariable Long id) {
        ParkingDTO dto = parkingService.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping(value = "/{id}/pay")
    public ResponseEntity<ParkingDTO> updatePayment(@PathVariable Long id, @RequestBody ParkingDTO dto) {
        dto = parkingService.updatePayment(id, dto);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping(value = "/{id}/out")
    public ResponseEntity<ParkingDTO> updateExit(@PathVariable Long id, @RequestBody ParkingDTO dto) {
        dto = parkingService.updateExit(id, dto);
        return ResponseEntity.ok().body(dto);
    }
}
