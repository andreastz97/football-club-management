package com.andreas.football.club.management.service;

import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.model.Team;
import com.andreas.football.club.management.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Transactional(readOnly = true)
    public List<GetTeamDTO> getTeamDTOS() {
        List<Team> teams = teamRepository.findAll();

        List<GetTeamDTO> teamsDTO = new ArrayList<>();
        for (Team team : teams) {
            GetTeamDTO getTeamDTO = new GetTeamDTO(team.getUuid(), team.getName(), team.getHomeStadium(), team.getTrophies());

            teamsDTO.add(getTeamDTO);
        }
        return teamsDTO;
    }


    @Transactional(readOnly = true)
    public GetTeamDTO getTeam(String uuid) {
        Optional<Team> optionalTeam = teamRepository.findById(uuid);
        if (optionalTeam.isEmpty()) {
            return null;
        }

        Team currentTeam = optionalTeam.get();
        GetTeamDTO getTeamDTO = new GetTeamDTO(currentTeam.getUuid(), currentTeam.getName(),
                currentTeam.getHomeStadium(), currentTeam.getTrophies());

        return getTeamDTO;
    }

    @Transactional
    public void createTeam(String name, String homeStadium, int trophies) {
        Team team = new Team();
        team.setUuid(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
        team.setName(name);
        team.setHomeStadium(homeStadium);
        team.setTrophies(trophies);
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
