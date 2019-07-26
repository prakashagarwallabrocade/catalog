package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Catalog;
import com.example.demo.repository.TestData;

@RestController
public class CatalogController {

	@Autowired
	private TestData testData;

	@GetMapping(path = "/catalog", produces = "application/json")
	public Catalog getCatalog() {

		return testData.getTestData();
	}

}
