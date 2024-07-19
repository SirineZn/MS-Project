package org.example.eventmanagementsystem.Models;

import lombok.Getter;
import org.example.eventmanagementsystem.DTO.EventDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Event {

    @Id
    private String id;
    @Getter
    private String name;
    @Getter
    private String description;
    @Getter
    private LocalDateTime date;
    @Getter
    private String location;
    @Getter
    private String productId;

    public Event() {
    }

    public Event(EventDTO eventDTO) {
        this.name = eventDTO.name();
        this.description = eventDTO.description();
        this.date = eventDTO.date();
        this.location = eventDTO.location();
        this.productId = eventDTO.productId();
    }

    // Getters and setters omitted for brevity

    public void updateFromDTO(EventDTO eventDTO) {
        this.name = eventDTO.name();
        this.description = eventDTO.description();
        this.date = eventDTO.date();
        this.location = eventDTO.location();
        this.productId = eventDTO.productId();
    }

    public String getId() {
        return id;
    }
}
