package com.edbg.snow.ihub.inventory.controller;

import com.edbg.snow.ihub.inventory.entity.Player;
import com.edbg.snow.ihub.inventory.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/player")
public class PlayerController {

    private static final Logger log = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerService playerService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllPlayers() {
        String allPlayers = playerService.getAllPlayers();
        if (allPlayers != null && !allPlayers.equals("")) {
            return new ResponseEntity<>(allPlayers, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createPlayer(@RequestBody Player player) {
        try {
            playerService.savePlayer(player);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            log.error(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
