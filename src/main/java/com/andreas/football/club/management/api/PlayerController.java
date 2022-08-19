package com.andreas.football.club.management.api;

import com.andreas.football.club.management.dto.SavePlayerDTO;
import com.andreas.football.club.management.model.Player;
import com.andreas.football.club.management.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("{uuid}")
    public Player getPlayer(@PathVariable String uuid) {
        return playerService.getPlayer(uuid);
    }

    @PostMapping
    public void createPlayer(@RequestBody SavePlayerDTO request) {
        playerService.createPlayer(request.getUuid(), request.getFirstName(), request.getLastName(), request.getAge(), request.getPosition(), request.getGoals());
    }

    @PutMapping
    public void updatePlayer(@PathVariable String uuid, @RequestBody SavePlayerDTO request) {
        playerService.updatePlayer(uuid, request.getFirstName(), request.getLastName(), request.getAge(), request.getPosition(), request.getGoals());
    }

    @DeleteMapping
    public void deletePlayer(@PathVariable String uuid) {
        playerService.deletePlayer(uuid);
    }
}
