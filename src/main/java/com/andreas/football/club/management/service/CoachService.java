package com.andreas.football.club.management.service;

import com.andreas.football.club.management.model.Coach;
import com.andreas.football.club.management.model.TacticType;
import com.andreas.football.club.management.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CoachService extends BaseEntityService {
    @Autowired
    private CoachRepository coachRepository;

    @Transactional(readOnly = true)
    public List<Coach> getCoaches() {
        return coachRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Coach getCoaches(String uuid) {
        Optional<Coach> optionalCoach = coachRepository.findById(Integer.valueOf(uuid));
        if (optionalCoach.isEmpty()) {
            return null;
        }
        return optionalCoach.get();
    }

    @Transactional
    public void createCoach(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        Coach coach = new Coach();

        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setAge(age);
        coach.setTactic(tactic);
    }

    @Transactional
    public void updateCoach(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        Coach coach = getCoaches(uuid);
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setAge(age);
        coach.setTactic(tactic);

    }

}
