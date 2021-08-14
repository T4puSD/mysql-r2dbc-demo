package com.example.demoreactive.repository;

import com.example.demoreactive.domain.Event;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EventRepository extends ReactiveCrudRepository<Event, Long> {
}
