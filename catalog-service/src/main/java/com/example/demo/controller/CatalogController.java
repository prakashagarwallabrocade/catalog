package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Catalog;
import com.example.demo.repository.CatalogRepository;
import com.example.demo.service.CatalogService;

@RestController
@CrossOrigin(origins = "*")
public class CatalogController {

	/*
	 * @Autowired CatalogRepository repo;
	 */
	@Autowired
	CatalogService catsvc;

	@GetMapping(path = "/catalog", produces = "application/json")
	public List<Catalog> getCatalog() {
		return catsvc.getAllCatalog();
		
	}
	
	/*
	 * @PostMapping(path = "/catalog", consumes = "application/json") public void
	 * post(@RequestBody final Catalog cat) { repo.save(cat); }
	 */
}

