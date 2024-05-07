package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "referee")
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReferee;

    private String name;
    private String country;

    public Referee() {
    }

    public Referee(Long idReferee, String name, String country) {
        this.idReferee = idReferee;
        this.name = name;
        this.country = country;
    }

    public Long getIdReferee() {
        return idReferee;
    }

    public void setIdReferee(Long idReferee) {
        this.idReferee = idReferee;
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

    @Override
    public String toString() {
        return
                "id=" + idReferee +
                ", name='" + name + '\'' +
                ", country='" + country + '\'';
    }
}
