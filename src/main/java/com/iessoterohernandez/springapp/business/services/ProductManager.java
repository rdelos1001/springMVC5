package com.iessoterohernandez.springapp.business.services;
import com.iessoterohernandez.springapp.business.entities.Product;
import java.util.List;

public interface ProductManager {

	public void increasePrice(int percentage);
	public List<Product> getProducts();
}
