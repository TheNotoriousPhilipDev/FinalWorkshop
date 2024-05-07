package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;

    private String name;
    private String position;
    private Date DateOfBirth;
    private String Nationality;

    @ManyToOne
    private Team idTeam;

    public Player() {
    }

    public Player(Long idPlayer, String name, String position, Date dateOfBirth, String nationality, Team idTeam) {
        this.idPlayer = idPlayer;
        this.name = name;
        this.position = position;
        DateOfBirth = dateOfBirth;
        Nationality = nationality;
        this.idTeam = idTeam;
    }

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public Team getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Team idTeam) {
        this.idTeam = idTeam;
    }
}
