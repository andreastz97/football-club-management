package com.andreas.football.club.management.service;

import com.andreas.football.club.management.dto.GetPlayerDTO;
import com.andreas.football.club.management.dto.SavePlayerDTO;
import com.andreas.football.club.management.mapper.PlayerMapper;
import com.andreas.football.club.management.model.Player;
import com.andreas.football.club.management.model.PositionType;
import com.andreas.football.club.management.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PlayerService extends PersonService {

    @Autowired
    private PlayerRepository playerRepository;

    private PlayerMapper playerMapper = new PlayerMapper();

    @Transactional(readOnly = true)
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Player getPlayer(String uuid) {
        Optional<Player> playerOptional = playerRepository.findById(uuid);
        if (playerOptional.isEmpty()) {
            return null;
        }
        return playerOptional.get();
    }

    @Transactional
    public void createPlayer(String firstName, String lastName, int age, PositionType position, int goals) {
        Player player = new Player();
                player.setUuid(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
                player.setFirstName(firstName);
                player.setLastName(lastName);
                player.setAge(age);
                player.setPosition(position);
                player.setGoals(goals);
                playerRepository.save(player);
        }

    @Transactional
    public void updatePlayer(String uuid ,String firstName, String lastName, int age, PositionType position, int goals) {
        Player player = new Player(uuid);
        player.setFirstName(firstName);
        player.setLastName(lastName);
        player.setAge(age);
        player.setPosition(position);
        player.setGoals(goals);
    }
    @Transactional
    public void deletePlayer(String uuid){
        playerRepository.deleteById(uuid);
    }
}
