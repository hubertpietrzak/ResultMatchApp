package com.hubertpietrzak.resultmatchapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Venue {

    @Column(insertable=false, updatable=false)
    private String id;
    @Column(insertable=false, updatable=false)
    private String name;
    private Long capacity;
    private String city_name;
    private String country_name;
    private String map_coordinates;

    @Column(insertable=false, updatable=false)
    private String country_code;

    public Venue() {

    }
}
