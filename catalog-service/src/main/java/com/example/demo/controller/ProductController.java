package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Catalog;
import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.CatalogService;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService prodService;

	@GetMapping(path = "/product/{productID}", produces = "application/json")
	public Optional<Product> getCatalog(@PathVariable Long productID) {
		return prodService.findProductById(productID);

	}
}