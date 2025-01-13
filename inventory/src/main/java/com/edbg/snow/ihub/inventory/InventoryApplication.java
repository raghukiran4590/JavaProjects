package com.edbg.snow.ihub.inventory;

import com.edbg.snow.ihub.inventory.entity.Player;
import com.edbg.snow.ihub.inventory.repository.PlayerRepository;
import com.edbg.snow.ihub.inventory.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.edbg.snow.ihub.inventory.entity")
public class InventoryApplication {

	@Autowired
	private static PlayerRepository playerRepository;



	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
		System.out.println("Infohub ServiceNow Inventory API");


		Player player = new Player();
		PlayerService playerService = new PlayerService(playerRepository);

		player.setId(1);
		player.setUsername("raghukiran4590");
		player.setEmail("raghukiran4590@gmail.com");
		player.setPassword("NewYear@2025");
//
//		playerRepository.save(player);
		playerService.savePlayer(player);

	}

}
