package org.example.eventmanagementsystem.DTO;

import java.time.LocalDateTime;

public record EventDTO(
        String id,
        String name,
        String description,
        LocalDateTime date,
        String location,
        String productId
) {
}

