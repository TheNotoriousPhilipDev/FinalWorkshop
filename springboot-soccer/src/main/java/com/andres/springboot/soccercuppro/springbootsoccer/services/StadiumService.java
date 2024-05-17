package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Stadium;

import java.util.List;
import java.util.Optional;

public interface StadiumService {

    List<Stadium> findAll();

    Optional<Stadium> findById(Long id);

    Stadium save(Stadium referee);

    boolean delete(Long id);
}
