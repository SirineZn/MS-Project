package org.example.onlinestorecatalog.Exceptions;


public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product not found: " + id);
    }
}

