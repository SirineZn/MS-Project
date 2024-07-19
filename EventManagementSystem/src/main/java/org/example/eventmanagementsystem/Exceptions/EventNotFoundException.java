package org.example.eventmanagementsystem.Exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(String id) {
        super("Event not found: " + id);
    }
}

