package com.projeto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}