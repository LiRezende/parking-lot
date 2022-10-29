package com.ligiarezende.parkinglot.dto;

import java.io.Serializable;

public class ParkingDTO implements Serializable {

    private Long id;
    private String plate;
    private boolean paid;
    private boolean left;

    public ParkingDTO() {
    }

    public ParkingDTO(Long id, String plate, boolean paid, boolean left) {
        this.id = id;
        this.plate = plate;
        this.paid = paid;
        this.left = left;
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

    public boolean getLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }
}
