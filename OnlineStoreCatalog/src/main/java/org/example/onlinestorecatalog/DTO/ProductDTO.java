package org.example.onlinestorecatalog.DTO;

public record ProductDTO(
        Long id,
        String name,
        String description,
        double price
) {
}
