package com.example.demo.service;

import java.util.Optional;

import com.example.demo.domain.Category;
import com.example.demo.domain.Product;
@FunctionalInterface
public interface ProductService {
  public Optional<Product> findProductById(Long id);
}
