package com.andreas.football.club.management.service;

import com.andreas.football.club.management.model.Fan;
import com.andreas.football.club.management.repository.FanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class FanService extends PersonService {
    @Autowired
    private FanRepository fanRepository;

    @Transactional(readOnly = true)
    public List<Fan> getFans() {
        return fanRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Fan getFan(String uuid) {
        Optional<Fan> optionalFan = fanRepository.findById(Integer.valueOf(uuid));
        if (optionalFan.isEmpty()) {
            return null;
        }
        return optionalFan.get();
    }

    @Transactional
    public void createFan(String firstName, String lastName, int age, String favouriteTeam) {
        Fan fan = new Fan();
        fan.setFirstName(firstName);
        fan.setLastName(lastName);
        fan.setAge(age);
        fan.setFavouriteTeam(favouriteTeam);
        fanRepository.save(fan);
    }

    public void updateFan(String uuid,String firstName, String lastName, int age, String favouriteTeam) {
        Fan fan = new Fan();
        fan.setFirstName(firstName);
        fan.setLastName(lastName);
        fan.setAge(age);
        fan.setFavouriteTeam(favouriteTeam);
    }
    public void deleteFan(String uuid){
        fanRepository.deleteById(Integer.valueOf(uuid));
    }
}
