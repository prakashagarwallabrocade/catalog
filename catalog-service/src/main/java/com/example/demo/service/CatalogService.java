package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Catalog;

@FunctionalInterface
public interface CatalogService {
	public List<Catalog> getAllCatalog();

}
