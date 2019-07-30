package com.example.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Catalog {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "catalog", cascade = CascadeType.ALL)
	private List<Category> categories;
}
