package com.ligiarezende.parkinglot.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_parking")
public class Parking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String plate;
    private Boolean paid;
    private Boolean left;

    public Parking() {
    }

    public Parking(Long id, String plate, Boolean paid, Boolean left) {
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
