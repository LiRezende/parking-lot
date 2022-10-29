package com.ligiarezende.parkinglot.repositries;

import com.ligiarezende.parkinglot.entities.Parking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
