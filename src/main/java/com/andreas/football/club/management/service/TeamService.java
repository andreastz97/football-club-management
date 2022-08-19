package com.andreas.football.club.management.service;

import com.andreas.football.club.management.model.Team;
import com.andreas.football.club.management.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Transactional(readOnly = true)
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Team getTeam(String uuid) {
        Optional<Team> optionalTeam = teamRepository.findById(Integer.valueOf(uuid));
        if (optionalTeam.isEmpty()) {
            return null;
        }
        return optionalTeam.get();
    }

    @Transactional
    public void createTeam(String uuid, String name, String homeStadium, int trophies) {
        Team team = new Team(Integer.valueOf(uuid));
        team.setUuid(uuid);
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
        teamRepository.save(team);
    }

    @Transactional
    public void updateTeam(String uuid, String name, String homeStadium, int trophies) {
        Team team = new Team(Integer.valueOf(uuid));
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
    }
}
