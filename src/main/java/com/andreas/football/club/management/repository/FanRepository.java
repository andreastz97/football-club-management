package com.andreas.football.club.management.repository;

import com.andreas.football.club.management.model.Fan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<Fan, Integer> {
}
