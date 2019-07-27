package com.example.demo.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Product;

@Repository
public class ProductRepository {

	@Autowired
	JdbcTemplate template;

	/* Getting all Items from table */
	public List<Product> getAllItems() {
		List<Product> products = template.query("select id, name,category, price from PRODUCT",
				(result, rowNum) -> new Product(result.getInt("id"), result.getString("name"),
						result.getString("category"), result.getInt("price")));
		return products;
	}

	/* Getting a specific item by item id from table */
	public Product getItem(int itemId) {
		String query = "SELECT * FROM PRODUCT WHERE ID=?";
		Product product = template.queryForObject(query, new Object[] { itemId },
				new BeanPropertyRowMapper<>(Product.class));

		return product;
	}

	/* Adding an item into database table */
	public int addItem(int id, String name, String category) {
		String query = "INSERT INTO PRODUCT VALUES(?,?,?)";
		return template.update(query, id, name, category);
	}

	/* delete an item from database */
	public int deleteItem(int id) {
		String query = "DELETE FROM PRODUCT WHERE ID =?";
		return template.update(query, id);
	}
}
