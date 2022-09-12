package com.andreas.football.club.management.service;

import com.andreas.football.club.management.model.Coach;
import com.andreas.football.club.management.model.TacticType;
import com.andreas.football.club.management.repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CoachService extends PersonService {
    @Autowired
    private CoachRepository coachRepository;

    @Transactional(readOnly = true)
    public List<Coach> getCoaches() {
        return coachRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Coach getCoaches(String uuid) {
        Optional<Coach> optionalCoach = coachRepository.findById(uuid);
        if (optionalCoach.isEmpty()) {
            return null;
        }
        return optionalCoach.get();
    }

    @Transactional
    public void createCoach(String firstName, String lastName, int age, TacticType tactic) {
        Coach coach = new Coach();
        coach.setUuid(UUID.randomUUID().toString().replace("-","").substring(0,8));
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setAge(age);
        coach.setTactic(tactic);
        coachRepository.save(coach);
    }

    @Transactional
    public void updateCoach(String uuid, String firstName, String lastName, int age, TacticType tactic) {
        Coach coach = getCoaches(uuid);
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setAge(age);
        coach.setTactic(tactic);

    }

    @Transactional
    public void deleteCoach(String uuid) {
        coachRepository.deleteById(uuid);
    }

}
