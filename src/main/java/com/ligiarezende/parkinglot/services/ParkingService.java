package com.ligiarezende.parkinglot.services;

import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.entities.Parking;
import com.ligiarezende.parkinglot.repositries.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    @Transactional
    public ParkingDTO create(ParkingDTO dto) {
        Parking entity = new Parking();
        dtoToEntity(dto, entity);
        entity = parkingRepository.save(entity);
        return new ParkingDTO(entity);
    }

    private void dtoToEntity(ParkingDTO dto, Parking entity) {
        entity.setPlate(dto.getPlate());
        entity.setPaid(dto.getPaid());
        entity.setLeft(dto.getLeft());
    }
}
