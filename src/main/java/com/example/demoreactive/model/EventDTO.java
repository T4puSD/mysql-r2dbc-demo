package com.example.demoreactive.model;

import com.example.demoreactive.domain.enumuration.EventName;

public record EventDTO(EventName eventName, String message) {
}
