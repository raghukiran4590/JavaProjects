package com.jdbc;

import com.jdbc.dao.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class BootjdbcexampleApplication implements CommandLineRunner {

    @Autowired
    private PlayerDao playerDao;

    public static void main(String[] args) {
        SpringApplication.run(BootjdbcexampleApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.playerDao.createTable());
        this.promptFromUser();
        this.promptForUpdate();
        this.promptForDelete();
    }

    public void promptFromUser() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the player ID: ");
        Integer playerId = Integer.parseInt(br.readLine());

        System.out.println("Enter the player Name: ");
        String playerName = br.readLine();

        System.out.println("Enter the player Age: ");
        Integer playerAge = Integer.parseInt(br.readLine());

        System.out.println("Enter the player City: ");
        String playerCity = br.readLine();

        int i = this.playerDao.insertPlayer(playerId, playerName, playerAge, playerCity);

        System.out.println(i + " Player Inserted");

    }

    public void promptForUpdate() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the player ID: ");
        Integer playerId = Integer.parseInt(br.readLine());

        System.out.println("Enter the player Name: ");
        String playerName = br.readLine();

        System.out.println("Enter the player Age: ");
        Integer playerAge = Integer.parseInt(br.readLine());

        System.out.println("Enter the player City: ");
        String playerCity = br.readLine();

        int i = this.playerDao.updatePlayer(playerId, playerName, playerAge, playerCity);

        System.out.println(i + " Player Updated");

    }

    public void promptForDelete() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the player ID: ");
        Integer playerId = Integer.parseInt(br.readLine());

        int i = this.playerDao.deletePlayer(playerId);

        System.out.println(i + " Player Deleted");

    }
}
