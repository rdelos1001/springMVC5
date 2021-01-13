package com.iessoterohernandez.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iessoterohernandez.springapp.business.entities.Product;
import com.iessoterohernandez.springapp.business.repositories.ProductRepository;
import java.util.List;

@Service
public class JPAProductManager {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts(){
		return (List<Product>)productRepository.findAll();
	}
	
	public void increasePrice (int percentage) {
		List<Product> products = (List<Product>) productRepository.findAll();
		if(products!=null) {
			for(Product product : products) {
				double newPrice =product.getPrice().doubleValue()*(100+percentage)/100;
				product.setPrice(newPrice);
				productRepository.save(product);
			}
		}
	}
}
