package com.andres.springboot.soccercuppro.springbootsoccer.entities;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "goals")
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGoal;

    @ManyToOne
    private Match match;

    @ManyToOne
    private Team team;

    @ManyToOne
    private Player player;

    private LocalTime timeScored;


    public Long getIdGoal() {
        return idGoal;
    }

    public void setIdGoal(Long idGoal) {
        this.idGoal = idGoal;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public LocalTime getTimeScored() {
        return timeScored;
    }

    public void setTimeScored(LocalTime timeScored) {
        this.timeScored = timeScored;
    }
}
