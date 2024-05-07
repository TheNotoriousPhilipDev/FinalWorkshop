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

    public Stadium() {
    }

    public Stadium(Long idStadium, String name, String city, int capacity) {
        this.idStadium = idStadium;
        this.name = name;
        this.city = city;
        this.capacity = capacity;
    }
}
