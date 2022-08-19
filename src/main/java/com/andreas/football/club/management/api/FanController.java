package com.andreas.football.club.management.api;

import com.andreas.football.club.management.dto.SaveFanDTO;
import com.andreas.football.club.management.model.Fan;
import com.andreas.football.club.management.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FanController {
    private final FanService fanService;

    @Autowired
    public FanController(FanService fanService) {
        this.fanService = fanService;
    }

    @GetMapping
    public List<Fan> getFans() {
        return fanService.getFans();
    }

    @GetMapping("{uuid}")
    public Fan getFan(@PathVariable String uuid) {
        return fanService.getFan(uuid);
    }

    @PostMapping
    public void createFan(@RequestBody SaveFanDTO request) {
        fanService.createFan(request.getUuid(), request.getFirstName(), request.getLastName(), request.getAge(), request.getFavouriteTeam());
    }

    @PutMapping("{uuid}")
    public void updateFan(@PathVariable String uuid, @RequestBody SaveFanDTO request) {
        fanService.updateFan(uuid, request.getFirstName(), request.getLastName(), request.getAge(), request.getFavouriteTeam());
    }

    @DeleteMapping
    public void deleteFan(@PathVariable String uuid) {
        fanService.deleteFan(uuid);
    }


}
