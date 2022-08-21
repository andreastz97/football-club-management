package com.andreas.football.club.management.api;

import com.andreas.football.club.management.dto.SaveCoachDTO;
import com.andreas.football.club.management.model.Coach;
import com.andreas.football.club.management.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("coaches")
@RestController
public class CoachController {
    private final CoachService coachService;

    @Autowired
    public CoachController(CoachService coachService) {
        this.coachService = coachService;
    }

    @GetMapping
    public List getCoaches() {
        return coachService.getCoaches();
    }

    @GetMapping("{uuid}")
    public Coach getCoach(@PathVariable String uuid) {
        return coachService.getCoaches(uuid);
    }

    @PostMapping
    public void createCoach(@RequestBody SaveCoachDTO request) {
        coachService.createCoach(request.getFirstName(), request.getLastName(), request.getAge(), request.getTactic());
    }

    @PutMapping("{uuid}")
    public void updateCoach(@PathVariable String uuid, @RequestBody SaveCoachDTO request) {
        coachService.updateCoach(uuid, request.getFirstName(), request.getLastName(), request.getAge(), request.getTactic());
    }

    @DeleteMapping
    public void deleteCoach(@PathVariable String uuid) {
        coachService.deleteCoach(uuid);
    }
}
