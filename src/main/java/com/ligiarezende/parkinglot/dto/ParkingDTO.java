package com.ligiarezende.parkinglot.dto;

import com.ligiarezende.parkinglot.entities.Parking;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

public class ParkingDTO implements Serializable {

    private Long id;
    @NotNull
    private String plate;
    @NotNull
    private boolean paid;
    @NotNull
    private boolean leftParking;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long totalTime;

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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }
}
