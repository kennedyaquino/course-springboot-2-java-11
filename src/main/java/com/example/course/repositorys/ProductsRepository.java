package com.example.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
