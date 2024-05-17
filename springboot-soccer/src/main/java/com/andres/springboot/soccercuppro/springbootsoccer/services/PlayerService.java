package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Match;
import com.andres.springboot.soccercuppro.springbootsoccer.entities.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    List<Player> findAll();

    Optional<Player> findById(Long id);

    Player save(Player player);

    boolean delete(Long id);


}
