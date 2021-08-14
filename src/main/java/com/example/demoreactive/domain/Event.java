package com.example.demoreactive.domain;

import com.example.demoreactive.domain.enumuration.EventName;
import org.springframework.data.annotation.Id;

import java.util.Objects;

public final class Event {
    @Id
    private Long id;
    private EventName eventName;
    private String message;

    public Event(EventName eventName, String message) {
        this.eventName = eventName;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventName getEventName() {
        return eventName;
    }

    public void setEventName(EventName eventName) {
        this.eventName = eventName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id.equals(event.id) && eventName == event.eventName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventName);
    }

    @Override
    public String toString() {
        return "Event[" +
                "id=" + id + ", " +
                "eventName=" + eventName + ", " +
                "message=" + message + ']';
    }

}
