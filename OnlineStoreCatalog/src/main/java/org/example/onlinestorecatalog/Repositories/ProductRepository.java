package org.example.onlinestorecatalog.Repositories;


import org.example.onlinestorecatalog.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

