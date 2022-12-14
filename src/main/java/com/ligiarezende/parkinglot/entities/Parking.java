package com.ligiarezende.parkinglot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_parking")
public class Parking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;
    private boolean paid;
    private boolean leftParking;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long totalTime;

    public Parking() {
    }

    public Parking(Long id, String plate, boolean paid, boolean leftParking) {
        this.id = id;
        this.plate = plate;
        this.paid = paid;
        this.leftParking = leftParking;
    }

    public Long getId() {
        return id;
    }

    public String getPlate() {

        return "****".concat(plate.substring(4,8));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parking parking = (Parking) o;
        return Objects.equals(id, parking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}