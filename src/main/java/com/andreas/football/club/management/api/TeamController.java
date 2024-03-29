package com.andreas.football.club.management.api;

import com.andreas.football.club.management.dto.GetTeamDTO;
import com.andreas.football.club.management.dto.SaveTeamDTO;
import com.andreas.football.club.management.exceptions.EmptyCoachException;
import com.andreas.football.club.management.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("teams")
@RestController
public class TeamController {

    private TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<GetTeamDTO> getTeamDTOS() {
        return teamService.getTeams();
    }

    @GetMapping("{uuid}")
    public GetTeamDTO getTeam(@PathVariable String uuid) {
        return teamService.getTeam(uuid);
    }

    @PostMapping
    public void createTeam(@RequestBody SaveTeamDTO request) throws EmptyCoachException {
        teamService.createTeam(request.getName(), request.getHomeStadium(), request.getTrophies(), request.getCoachUuid(), request.getPlayersUuid());
    }

    @PutMapping("{uuid}")
    public void updateTeam(@PathVariable String uuid, @RequestBody SaveTeamDTO request) {
        teamService.updateTeam(uuid, request.getName(), request.getHomeStadium(), request.getTrophies(), request.getCoachUuid(), request.getPlayersUuid());
    }

    @PutMapping("{uuid}/addPlayers")
    public void addPlayers(@PathVariable String uuid, @RequestBody SaveTeamDTO request) {
        teamService.addPlayers(uuid, request.getPlayersUuid());
    }

    @DeleteMapping("{uuid}")
    public void deleteTeam(@PathVariable String uuid) {
        teamService.deleteTeam(uuid);
    }

    //todo new dto
    //rename path
    @DeleteMapping("{uuid}/deletePlayer")
    public void deletePlayer(@PathVariable String uuid, @RequestBody SaveTeamDTO request) {
        teamService.deletePlayer(uuid , request.getPlayersUuid());
    }

}
