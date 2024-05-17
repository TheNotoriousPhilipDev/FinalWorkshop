package com.andres.springboot.soccercuppro.springbootsoccer.repositories;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Match;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Match, Long> {

    
}
