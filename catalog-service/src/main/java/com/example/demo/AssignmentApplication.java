
package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Catalog;
import com.example.demo.domain.Category;
import com.example.demo.domain.Product;
import com.example.demo.repository.CatalogRepository;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);

	}

}

@Component
class DemoCommandLineRunner implements CommandLineRunner {

	@Autowired
	CatalogRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("TestData.getTestData()::called");
		Catalog catalog = new Catalog();
		List<Category> categories = new ArrayList<>();

		Category television = new Category();
		television.setName("television");
		television.setCatalog(catalog);

		List<Product> products = new ArrayList<Product>();
		Product samsungTV = new Product();
		samsungTV.setName("samsungTV");
		samsungTV.setPrice(new BigDecimal(100.00));
		samsungTV.setCategory(television);
		
		Product lgTV = new Product();
		lgTV.setName("LG TV");
		lgTV.setPrice(new BigDecimal(200.00));
		lgTV.setCategory(television);

		products.add(samsungTV);
		products.add(lgTV);
		television.setProducts(products);
		categories.add(television);
		Category washingMachine = new Category();
		washingMachine.setCatalog(catalog);
		washingMachine.setName("washing Machine");
		categories.add(washingMachine);
		List<Product> washingMachineProdcuts = new ArrayList<Product>();
		Product samsungWashingMachine = new Product();
		samsungWashingMachine.setName("samsung Washing Machine");
		samsungWashingMachine.setPrice(new BigDecimal(200.00));
		samsungWashingMachine.setCategory(washingMachine);
		washingMachineProdcuts.add(samsungWashingMachine);
		washingMachine.setProducts(washingMachineProdcuts);
		// washingMachine.setProducts(washingMachineProdcuts);
		
		catalog.setCategories(categories);
		repo.save(catalog);
		 

	}
}