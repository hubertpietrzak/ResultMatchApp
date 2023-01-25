package com.hubertpietrzak.resultmatchapp.repository;

import com.hubertpietrzak.resultmatchapp.domain.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, String> {

    Iterable<Event> save(List<? extends Event> events);

}
