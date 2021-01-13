package com.iessoterohernandez.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iessoterohernandez.springapp.business.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
