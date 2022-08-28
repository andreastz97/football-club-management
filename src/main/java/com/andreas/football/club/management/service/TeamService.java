package com.andreas.football.club.management.service;

import com.andreas.football.club.management.model.Team;
import com.andreas.football.club.management.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Transactional(readOnly = true)
    public List<Team> getTeams() {return teamRepository.findAll();}
    @Transactional(readOnly = true)
    public Team getTeam(String uuid){
        Optional<Team> optionalTeam = teamRepository.findById(Integer.valueOf(uuid));
        if (optionalTeam.isEmpty()){
            return null;
        }
        return optionalTeam.get();
    }

    @Transactional
    public void createTeam(String name, String homeStadium, int trophies) {
        Team team = new Team();
        team.setUuid(UUID.randomUUID().toString().replace("-","").substring(0,8));
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
        teamRepository.save(team);
    }
    @Transactional
    public void updateTeam(String uuid,String name, String homeStadium, int trophies){
        Team team = new Team(uuid);
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
    }
    @Transactional
    public void deleteTeam(String uuid){
        teamRepository.deleteById(Integer.valueOf(uuid));
    }
}
