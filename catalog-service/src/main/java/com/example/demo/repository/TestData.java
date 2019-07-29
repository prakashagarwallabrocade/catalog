package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Catalog;
import com.example.demo.domain.Category;
import com.example.demo.domain.Product;

@Component
public class TestData {

	public Catalog getTestData() {
		System.out.println("TestData.getTestData()::called");
		Catalog catalog = new Catalog();
		List<Category> categories = new ArrayList<>();

		Category television = new Category();
		television.setName("television");

		java.util.List<Product> products = new ArrayList<>();
		Product samsungTV = new Product();
		samsungTV.setProductId(1);
		samsungTV.setName("samsungTV");
		samsungTV.setPrice(new BigDecimal(100.00));

		Product lgTV = new Product();
		lgTV.setProductId(2);
		lgTV.setName("LG TV");
		lgTV.setPrice(new BigDecimal(200.00));

		products.add(samsungTV);
		products.add(lgTV);
		television.setProducts(products);

		categories.add(television);

		Category washingMachine = new Category();
		
		washingMachine.setName("washing Machine");
		categories.add(washingMachine);
		java.util.List<Product> washingMachineProdcuts = new ArrayList<>();
		Product samsungWashingMachine = new Product();
		samsungWashingMachine.setProductId(3);
		samsungWashingMachine.setName("samsung Washing Machine");
		samsungWashingMachine.setPrice(new BigDecimal(200.00));
		washingMachineProdcuts.add(samsungWashingMachine);
		washingMachine.setProducts(washingMachineProdcuts);

		catalog.setCategories(categories);
		return catalog;

	}

}
