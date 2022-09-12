package com.andreas.football.club.management.service;

import com.andreas.football.club.management.mapper.TeamMapper;
import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.model.Coach;
import com.andreas.football.club.management.model.Player;
import com.andreas.football.club.management.model.Team;
import com.andreas.football.club.management.repository.CoachRepository;
import com.andreas.football.club.management.repository.PlayerRepository;
import com.andreas.football.club.management.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private PlayerRepository playerRepository;

    private TeamMapper teamMapper = new TeamMapper();

    @Transactional(readOnly = true)
    public List<GetTeamDTO> getTeams() {

        List<Team> teams = teamRepository.findAll();

        return teamMapper.mapTeamsList(teams);
    }

    @Transactional(readOnly = true)
    public GetTeamDTO getTeam(String uuid) {
        Optional<Team> optionalTeam = teamRepository.findById(uuid);

        if (optionalTeam.isEmpty()) {
            return null;
        }
        return teamMapper.map(optionalTeam.get());
    }


    @Transactional
    public void createTeam(String name, String homeStadium, int trophies, String coachUuid, List<String> playersUuid) {

        Optional<Coach> optionalCoach = coachRepository.findById(coachUuid);

        Team team = new Team();
        team.setUuid(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);

        if (optionalCoach.isEmpty()) {
            throw new RuntimeException("Empty coach uuid");
        }
        team.setCoach(optionalCoach.get());

        List<Player> playersList = playerRepository.findAllById(playersUuid);
        team.setTeamPlayers(playersList);
        teamRepository.save(team);
    }

    @Transactional
    public void updateTeam(String uuid, String name, String homeStadium, int trophies) {
        Team team = new Team(uuid);
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
    }

    @Transactional
    public void deleteTeam(String uuid) {
        teamRepository.deleteById(uuid);
    }
}
