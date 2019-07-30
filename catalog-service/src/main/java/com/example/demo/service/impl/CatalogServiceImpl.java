package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Catalog;
import com.example.demo.repository.CatalogRepository;
import com.example.demo.service.CatalogService;
@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private CatalogRepository repo;

	@Override
	public List<Catalog> getAllCatalog() {	
		return repo.findAll();
		
	}

}
