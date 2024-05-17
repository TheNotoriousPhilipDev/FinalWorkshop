package com.andres.springboot.soccercuppro.springbootsoccer.services;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Goal;

import java.util.List;
import java.util.Optional;

public interface GoalService {

    List<Goal> findAll();

    Optional<Goal> findById(Long id);

    Goal save(Goal goal);

    boolean delete(Long id);
}
