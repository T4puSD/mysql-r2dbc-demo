package com.example.demoreactive.controller;

import com.example.demoreactive.domain.Event;
import com.example.demoreactive.facility.EventFacility;
import com.example.demoreactive.model.EventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventFacility eventFacility;

    @Autowired
    public EventController(EventFacility eventFacility) {
        this.eventFacility = eventFacility;
    }

    @GetMapping(value = "/", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Event> findAll() {
        return eventFacility.findAll();
    }

    @PostMapping("/")
    public Mono<Event> save(@RequestBody EventDTO eventDTO) {
        return eventFacility.save(new Event(eventDTO.eventName(), eventDTO.message()));
    }
}
