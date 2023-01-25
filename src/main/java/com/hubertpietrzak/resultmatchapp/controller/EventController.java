package com.hubertpietrzak.resultmatchapp.controller;

import com.hubertpietrzak.resultmatchapp.domain.Event;
import com.hubertpietrzak.resultmatchapp.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public Iterable<Event> list(){
        return eventService.list();
    }
}
