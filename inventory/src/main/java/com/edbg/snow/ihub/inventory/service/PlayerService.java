package com.edbg.snow.ihub.inventory.service;

import com.edbg.snow.ihub.inventory.entity.Player;
import com.edbg.snow.ihub.inventory.repository.PlayerRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository1) {
        this.playerRepository = playerRepository1;
    }

    public SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
    }

    public String getAllPlayers() {
        return  " ";
    }

    public void savePlayer(Player player) {
//        Session session = getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//		player.setId(1);
//		player.setUsername("raghukiran4590");
//		player.setEmail("raghukiran4590@gmail.com");
//		player.setPassword("NewYear@2025");
//        player.setId(player.getId());
//        player.setUsername(player.getUsername());
//        player.setEmail(player.getEmail());
//        player.setPassword(player.getPassword());
//        player.setVersion(player.getVersion());
        this.playerRepository.saveAndFlush(player);
//        tx.commit();
        System.out.println("Player Added and committed successfully!");
    }

//    public void updatePlayers(List<Player> players) {
//        playerRepository.saveAllAndFlush(players);
//    }

}
