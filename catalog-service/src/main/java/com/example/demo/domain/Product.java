package com.example.demo.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private BigDecimal price;

	public Product() {
		super();
	}
	
	public Product(Long id, String name, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn
	private Category category;
}