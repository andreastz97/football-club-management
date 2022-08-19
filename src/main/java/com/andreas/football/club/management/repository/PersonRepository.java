package com.andreas.football.club.management.repository;

import com.andreas.football.club.management.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Coach, Integer> {
}
