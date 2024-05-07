package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTeam;

    private String name;
    private String country;
    private String coach;


    public Team() {
    }

    public Team(Long idTeam, String name, String country, String coach) {
        this.idTeam = idTeam;
        this.name = name;
        this.country = country;
        this.coach = coach;
    }

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
}
