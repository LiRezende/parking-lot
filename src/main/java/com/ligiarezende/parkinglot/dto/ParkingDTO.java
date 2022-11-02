package com.ligiarezende.parkinglot.dto;

import com.ligiarezende.parkinglot.entities.Parking;

import java.io.Serializable;

public class ParkingDTO implements Serializable {

    private Long id;
    private String plate;
    private boolean paid;
    private boolean leftParking;

    public ParkingDTO() {
    }

    public ParkingDTO(Long id, String plate, boolean paid, boolean leftParking) {
        this.id = id;
        this.plate = plate;
        this.paid = paid;
        this.leftParking = leftParking;
    }

    public ParkingDTO(Parking entity) {
        this.id = entity.getId();
        this.plate = entity.getPlate();
        this.paid = entity.getPaid();
        this.leftParking = entity.getLeftParking();
    }

    public Long getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean getLeftParking() {
        return leftParking;
    }

    public void setLeftParking(boolean leftParking) {
        this.leftParking = leftParking;
    }
}
