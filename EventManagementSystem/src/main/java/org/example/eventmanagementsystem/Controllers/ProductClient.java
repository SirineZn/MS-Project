package org.example.eventmanagementsystem.Controllers;

import org.example.eventmanagementsystem.DTO.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/products/{productId}")
    ProductDTO getProductById(@PathVariable String productId);
}

