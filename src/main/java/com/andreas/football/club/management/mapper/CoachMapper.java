package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetCoachDTO;
import com.andreas.football.club.management.model.Coach;

import java.util.ArrayList;
import java.util.List;

public class CoachMapper {
    public GetCoachDTO map(Coach coach) {
        return new GetCoachDTO(coach.getUuid(), coach.getFirstName(),
                coach.getLastName(), coach.getAge(), coach.getTactic());
    }

    public List<GetCoachDTO> mapCoachesDTO(List<Coach> coachList) {
        List<GetCoachDTO> coachDTO = new ArrayList<>();
        for (Coach coach : coachList) {
            coachDTO.add(map(coach));
        }
        return coachDTO;
    }
}
