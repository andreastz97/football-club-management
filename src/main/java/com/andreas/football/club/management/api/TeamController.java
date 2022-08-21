package com.andreas.football.club.management.api;

import com.andreas.football.club.management.dto.SavePlayerDTO;
import com.andreas.football.club.management.dto.SaveTeamDTO;
import com.andreas.football.club.management.model.Team;
import com.andreas.football.club.management.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getTeams() {
        return teamService.getTeams();
    }

    @GetMapping("{uuid}")
    public Team getTeam(@PathVariable String uuid) {
        return teamService.getTeam(uuid);
    }

    @PostMapping
    public void createTeam(@RequestBody SaveTeamDTO request) {
        teamService.createTeam(request.getName(), request.getHomeStadium(), request.getTrophies());
    }

    @PutMapping
    public void updateTeam(@PathVariable String uuid, @RequestBody SaveTeamDTO request) {
        teamService.updateTeam(uuid,request.getName(), request.getHomeStadium(), request.getTrophies());
    }

    @DeleteMapping("{/uuid}")
    public void deleteTeam(@PathVariable String uuid) {
        teamService.deleteTeam(uuid);
    }


}
