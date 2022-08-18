package com.andreas.football.club.management.model;

import javax.persistence.*;

@Entity
@Table(name = "coaches")
public class Coach extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private TacticType tactic;
}
