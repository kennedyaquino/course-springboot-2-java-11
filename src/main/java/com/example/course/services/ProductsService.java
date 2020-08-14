package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Products;
import com.example.course.repositorys.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	private ProductsRepository repository;
	
	public List<Products> findAll(){
		return repository.findAll();
	}
	
	public Products findById(long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
	}
}
