package com.hubertpietrzak.resultmatchapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sport_event_id;
    private String start_date;
    private String sport_name;
    private String competition_name;
    private String competition_id;
    private String season_name;
    @Embedded
    private Competitor competitors;
    @Embedded
    private Venue venue;
    private double probability_home_team_winner;
    private double probability_draw;
    private double probability_away_team_winner;

    public Event() {

    }
}
