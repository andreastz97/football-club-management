package com.andreas.football.club.management.mapper;

import com.andreas.football.club.management.dto.GetCoachDTO;
import com.andreas.football.club.management.model.Coach;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CoachMapper {
    public GetCoachDTO mapGetCoach(Coach coach) {
        return new GetCoachDTO(coach.getUuid(), coach.getFirstName(),
                coach.getLastName(), coach.getAge(), coach.getTactic() , coach.getTeam().getUuid());
    }

    public List<GetCoachDTO> mapCoachesListDTO(List<Coach> coachList) {
        List<GetCoachDTO> coachDTO = new ArrayList<>();
        for (Coach coach : coachList) {
            coachDTO.add(mapGetCoach(coach));
        }
        return coachDTO;
    }
}
