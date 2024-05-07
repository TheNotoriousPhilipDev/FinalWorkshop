package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatch;

    private Date date;
    private Date time;

    @OneToOne
    private Team homeTeamId;

    @OneToOne
    private Team awayTeamId;

    @OneToOne
    private Stadium stadiumId;

    @OneToOne
    private Referee refereeId;

    public Match() {
    }

    public Match(Long idMatch, Date date, Date time, Team homeTeamId, Team awayTeamId, Stadium stadiumId, Referee refereeId) {
        this.idMatch = idMatch;
        this.date = date;
        this.time = time;
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
        this.stadiumId = stadiumId;
        this.refereeId = refereeId;
    }

    public Long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Team getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Team homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Team getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(Team awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public Stadium getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Stadium stadiumId) {
        this.stadiumId = stadiumId;
    }

    public Referee getRefereeId() {
        return refereeId;
    }

    public void setRefereeId(Referee refereeId) {
        this.refereeId = refereeId;
    }
}
