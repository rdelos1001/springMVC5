package com.iessoterohernandez.springapp.business.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.iessoterohernandez.springapp.business.SpringappBusinessConfig;
import com.iessoterohernandez.springapp.business.entities.Product;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {SpringappBusinessConfig.class})
public class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Test
	public void testGetProductList() {
		List<Product> products =(List<Product>) productRepository.findAll();
		assertEquals(products.size(),3,0);
	}
	
	@Test
	public void testSaveProduct() {
		List<Product> products = (List<Product>) productRepository.findAll();
		
		Product p =products.get(0);
		Double price = p.getPrice();
		p.setPrice(200.12);
		productRepository.save(p);
		
		List<Product> updateProducts = (List<Product>) productRepository.findAll();
		Product p2 = updateProducts.get(0);
		assertEquals(p2.getPrice(),200.12,0);
		
		p2.setPrice(price);
		productRepository.save(p2);
	}
}
