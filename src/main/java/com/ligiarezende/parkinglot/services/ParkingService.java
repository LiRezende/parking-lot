package com.ligiarezende.parkinglot.services;

import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.entities.Parking;
import com.ligiarezende.parkinglot.services.exceptions.ResourceNotFoundException;
import com.ligiarezende.parkinglot.repositries.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    @Transactional
    public ParkingDTO create(ParkingDTO dto) {
        Parking entity = new Parking();
        dtoToEntity(dto, entity);
        entity.setStartTime(LocalDateTime.now());
        entity = parkingRepository.save(entity);
        return new ParkingDTO(entity);
    }

    @Transactional(readOnly = true)
    public ParkingDTO findById(Long id) {
        Optional<Parking> obj = parkingRepository.findById(id);
        Parking entity = obj.orElseThrow(() -> new ResourceNotFoundException("Placa não encontrada."));
        return new ParkingDTO(entity);
    }

    @Transactional
    public ParkingDTO updatePayment(Long id, ParkingDTO dto) {
        try {
            Parking entity = parkingRepository.getReferenceById(id);
            entity.setEndTime(LocalDateTime.now());
            Long timeTotal = ChronoUnit.MINUTES.between(entity.getStartTime(), entity.getEndTime());
            entity.setTotalTime(timeTotal);
            entity.setPaid(dto.getPaid());
            entity = parkingRepository.save(entity);
            return new ParkingDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Registro #" + id + " não encontrado.");
        }
    }

    @Transactional
    public ParkingDTO updateExit(Long id, ParkingDTO dto) {
        try {
            Parking entity = parkingRepository.getReferenceById(id);

            if (entity.getPaid()) {
                entity.setLeftParking(dto.getLeftParking());
                entity = parkingRepository.save(entity);
            }

            return new ParkingDTO(entity);

        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Registro #" + id + " não encontrado.");
        }
    }

    private void dtoToEntity(ParkingDTO dto, Parking entity) {
        entity.setPlate(dto.getPlate());
        entity.setPaid(dto.getPaid());
        entity.setLeftParking(dto.getLeftParking());
    }
}
