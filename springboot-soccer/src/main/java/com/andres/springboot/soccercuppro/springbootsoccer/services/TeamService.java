package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findAll();

    Optional<Team> findById(Long id);

    Team save(Team referee);

    boolean delete(Long id);
}
