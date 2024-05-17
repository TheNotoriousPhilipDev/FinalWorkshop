package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Match;

import java.util.List;
import java.util.Optional;

public interface MatchService {

    List<Match> findAll();

    Optional<Match> findById(Long id);

    Match save(Math match);

    boolean delete(Long id);

    void generateScores (Long matchId);


}
