package com.example.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
