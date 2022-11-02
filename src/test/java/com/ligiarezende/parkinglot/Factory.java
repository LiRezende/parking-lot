package com.ligiarezende.parkinglot;

import com.ligiarezende.parkinglot.dto.ParkingDTO;
import com.ligiarezende.parkinglot.entities.Parking;

public class Factory {

    public static Parking createParking() {
        return new Parking(1L, "ZKV-0259", false, false);
    }

    public static ParkingDTO createParkingDTO() {
        return new ParkingDTO(createParking());
    }
}
