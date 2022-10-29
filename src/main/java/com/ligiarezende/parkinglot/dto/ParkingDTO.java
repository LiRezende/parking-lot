package com.ligiarezende.parkinglot.dto;

import java.io.Serializable;

public class ParkingDTO implements Serializable {

    private Long id;
    private String plate;
    private Boolean paid;
    private Boolean left;

    public ParkingDTO() {
    }

    public ParkingDTO(Long id, String plate, Boolean paid, Boolean left) {
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

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Boolean getLeft() {
        return left;
    }

    public void setLeft(Boolean left) {
        this.left = left;
    }
}
