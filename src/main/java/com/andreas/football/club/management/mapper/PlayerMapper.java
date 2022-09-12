package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetPlayerDTO;
import com.andreas.football.club.management.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerMapper {
    public GetPlayerDTO map(Player player) {
        return new GetPlayerDTO(player.getUuid(), player.getFirstName(),
                player.getLastName(), player.getAge(),player.getPosition(),player.getGoals());
    }
    public List<GetPlayerDTO> mapPLayerList(List<Player> playerList) {
        List<GetPlayerDTO> playerDTOS = new ArrayList<>();
        for (Player player : playerList) {
            playerDTOS.add(map(player));
        }
        return playerDTOS;
    }
    }

