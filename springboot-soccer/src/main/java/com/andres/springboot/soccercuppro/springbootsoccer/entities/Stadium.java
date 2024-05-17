package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "stadium")
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStadium;

    private String name;
    private String city;
    private int capacity;

    public Long getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(Long idStadium) {
        this.idStadium = idStadium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
