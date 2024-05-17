package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Referee;

import java.util.List;
import java.util.Optional;

public interface RefereeService {

    List<Referee> findAll();

    Optional<Referee> findById(Long id);

    Referee save(Referee referee);

    boolean delete(Long id);

}
