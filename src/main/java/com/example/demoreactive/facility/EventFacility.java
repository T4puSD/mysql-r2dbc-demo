package com.example.demoreactive.facility;

import com.example.demoreactive.domain.Event;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventFacility {
    Mono<Event> save(Event event);
    Flux<Event> findAll();
}
