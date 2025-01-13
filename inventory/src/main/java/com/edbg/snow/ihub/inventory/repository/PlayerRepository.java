package com.edbg.snow.ihub.inventory.repository;

import com.edbg.snow.ihub.inventory.entity.Player;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Configuration
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
