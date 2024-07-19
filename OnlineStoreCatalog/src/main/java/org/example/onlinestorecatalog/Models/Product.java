package org.example.onlinestorecatalog.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.example.onlinestorecatalog.DTO.ProductDTO;

@Getter
@Entity
public class Product {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;

    public Product() {
    }

    public Product(ProductDTO productDTO) {
        this.name = productDTO.name();
        this.description = productDTO.description();
        this.price = productDTO.price();
    }

    // Getters and setters omitted for brevity

    public void updateFromDTO(ProductDTO productDTO) {
        this.name = productDTO.name();
        this.description = productDTO.description();
        this.price = productDTO.price();
    }

}

