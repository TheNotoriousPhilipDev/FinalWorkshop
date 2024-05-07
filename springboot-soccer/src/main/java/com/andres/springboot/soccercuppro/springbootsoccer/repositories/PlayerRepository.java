package com.andres.springboot.soccercuppro.springbootsoccer.repositories;

import com.andres.springboot.soccercuppro.springbootsoccer.entities.Player;
import org.springframework.data.repository.CrudRepository;

    

public interface PlayerRepository extends CrudRepository<Player, Long> {


}
