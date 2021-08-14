package com.example.demoreactive.facility;

import com.example.demoreactive.domain.Event;
import com.example.demoreactive.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventFacilityImpl implements EventFacility {
    private final EventRepository eventRepository;

    @Autowired
    public EventFacilityImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Mono<Event> save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Flux<Event> findAll() {
        return eventRepository.findAll();
    }
}
